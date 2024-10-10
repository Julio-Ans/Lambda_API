import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsomeApi {

    private static final String API_URL = "https://jsonplaceholder.typicode.com/comments";

    static String enviarRequisicao() throws IOException, InterruptedException {


    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(API_URL))
            .build();

    HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();

}
}

