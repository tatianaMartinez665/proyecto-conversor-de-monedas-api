import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaApi {
    Gson gson = new Gson();
    String API_KEY="d5f7ae680c2d5045eb20eae1";
    public double conversion(String monedaOrigen, String monedaDestino) throws IOException, InterruptedException {
        String url = String.format("https://v6.exchangerate-api.com/v6/%s/pair/%s/%s", API_KEY, monedaOrigen, monedaDestino);

        URI direccion= URI.create(url);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        HttpResponse<String > response = client
                .send(request,HttpResponse.BodyHandlers.ofString());
        //String json = response.body();
       // System.out.println("json crudo "+json);
        ConversionApi respuesta = gson.fromJson(response.body(), ConversionApi.class);

        return respuesta.conversion_rate();
    }

}
