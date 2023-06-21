import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpStatusChecker {
    public String getStatusImage(int code) throws Exception {
        String url = "https://http.cat/" + code + ".jpg";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<InputStream> response = client
                .send(request, HttpResponse.BodyHandlers.ofInputStream());

        if(response.statusCode() == 200){
            return url;
        }else{
            throw new Exception();
        }
    }
}
