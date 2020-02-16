package UsingHttpClient;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;

public class LinkValidatorSync {

    private static HttpClient client;

    public static void main(String[] args) throws IOException  {
        client = HttpClient.newHttpClient();

        Files.lines(Path.of("/home/ultimate/IdeaProjects/Practice/src/UsingHttpClient/urls.txt"))
                .map(LinkValidatorSync::validateLink)
                .forEach(System.out::println);;
    }

    private static String validateLink(String link) {
        System.out.println("Validating link: " + link);
        HttpRequest request = HttpRequest.newBuilder(URI.create(link))
                .GET()
                .build();
        try {
            HttpResponse<Void> response = client.send(request, HttpResponse.BodyHandlers.discarding());
            return responseToString(response);
        } catch (IOException | InterruptedException e) {
            return String.format("%s -> %s", link, false);
        }
    }

    private static String responseToString(HttpResponse<Void> response) {
        int status = response.statusCode();
        boolean success = status >= 200 && status <=299;
        return String.format("%s -> %s (status: %s) \n", response.uri(), success, status);
    }


}
