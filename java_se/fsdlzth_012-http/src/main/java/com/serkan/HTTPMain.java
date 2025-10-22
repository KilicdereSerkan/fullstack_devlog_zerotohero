package com.serkan;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.OutputStream;
import java.net.InetSocketAddress;

/**
 * Some advanced topics like exceptions also http is advanced but this is simple operations for http this for introduction
 */
public class HTTPMain {
    static void main() {
/*
        HTTP in Java
        HTTP is the protocol browsers and servers use to talk. In Java you can both send HTTP requests (client) and receive them (server). Modern Java provides a simple built-in HTTP client API and older legacy classes that still work.
*/

 /*
        Basic client: GET (retrieve data)
                - What it does: asks a server for a resource (for example a web page or JSON).
        - Use when: you want to read data from an API or website.
 */
 //       Example using Java 11+ HttpClient:
     try {
         HttpClient client = HttpClient.newHttpClient();
         HttpRequest request = HttpRequest.newBuilder()
                 .uri(URI.create("https://api.example.com/data"))
                 .GET()
                 .build();

         HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
         System.out.println("Status: " + response.statusCode());
         System.out.println("Body: " + response.body());
//        Key points: check the status code (200 means OK) and read the body for the returned data.
     } catch (Exception e) {
         System.out.print("unwanted ex");
     }


/*
                Basic client: POST (send data)
                - What it does: sends data to a server (form submit, create resource).
                - Use when: you need to create or update data on a remote API.
                Simple POST example with JSON body:
 */
        try {
            String json = "{\"name\":\"Alice\",\"age\":30}";

            HttpRequest requestreq = HttpRequest.newBuilder()
                    .uri(URI.create("https://api.example.com/users"))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(json))
                    .build();

            HttpResponse<String> resp = HttpClient.newHttpClient().send(requestreq, HttpResponse.BodyHandlers.ofString());
            System.out.println("Status: " + resp.statusCode());
            System.out.println("Response: " + resp.body());
        }catch (Exception e) {
            System.out.println("unwanted ex");
        }
//        Key points: set headers (like Content-Type) and provide a body publisher for the data.


/*
        Older option: HttpURLConnection
                - What it is: the legacy Java API for HTTP available before HttpClient.
        - When to see it: you might find it in older code, but it is more verbose and lower-level.
 */

 //               Basic server: simple HTTP server
 /*
                - What it does: listens on a port and responds to incoming HTTP requests.
        - Use when: you want a tiny local server for testing or simple APIs.
        Tiny server example using com.sun.net.httpserver.HttpServer:
  */

try {
    HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
    server.createContext("/", new HttpHandler() {
        public void handle(HttpExchange exchange) throws IOException {
            String response = "Hello from Java server";
            exchange.sendResponseHeaders(200, response.getBytes().length);
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    });
    server.setExecutor(null);
    server.start();
    System.out.println("Server running on port 8000");
}catch (Exception ex){
    System.out.println("unwanted ex");
}
//        Key points: choose a path (context), write a handler that builds the response, then start the server.
/*
                Quick practical tips
        - Check status codes to know success or error.
                - Use JSON libraries (Jackson, Gson) to convert between Java objects and JSON.
                - Set timeouts for network calls to avoid hanging requests.
        - Use HttpClient (Java 11+) for simpler and more modern code; only use HttpURLConnection for legacy compatibility.

 */



    }
}
