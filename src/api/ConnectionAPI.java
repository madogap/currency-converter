package api;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConnectionAPI {
    private String keyApi = "f95b072a3c6624fc0ea34d89";
    private String url = "https://v6.exchangerate-api.com/v6/" + keyApi;

    public ResponseApi connect(String currency, String currency2, String amount) {
        try {
            // Create a client
            HttpClient client = HttpClient.newHttpClient();
            // Create a request
            HttpRequest request = HttpRequest.newBuilder()
                    // Set the URL like(10 USD => n EUR):
                    // https://v6.exchangerate-api.com/v6/keyApi/pair/USD/EUR/10
                    .uri(URI.create(url + "/pair/" + currency + "/" + currency2 + "/" + amount))
                    .build();
            // Send the request
            //System.out.println(request);

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() != 200) {
                System.out.println("Error: HTTP status code " + response.statusCode());
                return null;
            }
            // Parse the response
            Gson gson = new Gson().newBuilder().setPrettyPrinting().create();
            //System.out.println(gson);
            ResponseApi res = gson.fromJson(response.body(), ResponseApi.class);
            return res;
            //System.out.println(res);
            // Return the response
            //return res;
        }catch (IOException e){
            System.out.println("Error: IOException - " + e.getMessage());
            return null;
        } catch (InterruptedException e){
            System.out.println("Error: InterruptedException - " + e.getMessage());
            return null;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
}
