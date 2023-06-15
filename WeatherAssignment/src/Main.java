import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient clint =HttpClient.newBuilder().build();

        HttpRequest request=HttpRequest.newBuilder().GET().uri(URI.create("https://api.chucknorris.io/jokes/random")).build();

        HttpResponse< String> response= clint.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());




    }
}