package Java.UsingHttpClient;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class LinkValidatorAsyncRobust {

    private static HttpClient client;

    public static void main(String[] args) throws IOException  {
        client = HttpClient.newBuilder()
                    .connectTimeout(Duration.ofSeconds(3)) //establishing a connection to a server timeout
                    .followRedirects(HttpClient.Redirect.NORMAL)
                    .build();

        var futures = Files.lines(Path.of("/home/ultimate/IdeaProjects/Practice/src/UsingHttpClient/urls.txt"))
                .map(LinkValidatorAsyncRobust::validateLink)
                .collect(Collectors.toList());

        futures.stream()
                .map(CompletableFuture::join)
                .forEach(System.out::println);
    }

    private static CompletableFuture<String> validateLink(String link) {
        System.out.println("Validating link: " + link);
        HttpRequest request = HttpRequest.newBuilder(URI.create(link))
                .timeout(Duration.ofSeconds(2))  //wait for the request response timeout
                .GET()
                .build();

        return client.sendAsync(request, HttpResponse.BodyHandlers.discarding())
                .thenApply(LinkValidatorAsyncRobust::responseToString)
                .exceptionally(e -> String.format("%s -> %s", link, false));

    }

    private static String responseToString(HttpResponse<Void> response) {
        int status = response.statusCode();
        boolean success = status >= 200 && status <=299;
        return String.format("%s -> %s (status: %s) \n", response.uri(), success, status);
    }


}
