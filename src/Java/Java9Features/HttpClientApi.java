package Java.Java9Features;

/*
HTTP/2  vs HTTP/1.1:
Similarities:
    - still request/response based
    - GET/POST/PUT/etc methods

Differences:
    - Binary protocol( vs text based in HTTP/1.1)
    - Mandatory TLS (vs optional in HTTP/1.1)
    - Multiplexing over single TCP connection (streams)
    - server push capability(instead of waiting for a request)
 */

/*

HttpClient: Important Types

    HttpClient.Builder
        -used to instantiate a HttpClient

    HttpClient  - you need to use the HttpClient.Builder to instantiate it
     send()      - sends a request and blocks until a response is in
     sendAsync() - doesn't block and returns a CompletableFuture which will be completed once the response comes
     . . .

    HttpRequest.Builder
        - used to instantiate a HttpRequest

    HttpRequest  - you need to use the HttpRequest.Builder to instantiate it
     uri()
     headers()
     methods()
     . . .

    HttpResponse
     uri()
     statusCode()
     body()
     . . .
 */

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;


public class HttpClientApi {


    public static void main(String[] args) throws IOException, InterruptedException {

//================== build synchronous request
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create("https://www.pluralsight.com"))
                        .GET()
                        .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if(response.statusCode() == 200) {
            System.out.println(response.headers().map());
        }


//================== build asynchronous request
        HttpClient.Builder builder = HttpClient.newBuilder();
        builder.version(HttpClient.Version.HTTP_2)
                .followRedirects(HttpClient.Redirect.ALWAYS);

        HttpClient client1 = builder.build();
        HttpRequest request1 = HttpRequest.newBuilder(URI.create("https://www.google.com"))
                .header("User-Agent", "Java")
                .timeout(Duration.ofMillis(500))
                .GET()
                .build();

        CompletableFuture<HttpResponse<String>> response1 = client1
                .sendAsync(request1, HttpResponse.BodyHandlers.ofString());

        response1.thenAccept(r -> {
            System.out.println("Version: " + r.version());
            System.out.println(r.body());
        });

        response1.join(); // waits until the CompletableFuture is done


    }
}
