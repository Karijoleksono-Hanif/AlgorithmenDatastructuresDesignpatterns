import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        GUI.createGui();

        try {
            // URL van de API
            String apiUrl = "https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1";

            // Een URL-object maken
            URL url = new URL(apiUrl);

            // Verbinding maken met de API en gegevens ophalen
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // De verkregen gegevens verwerken
            System.out.println("API-response: " + response.toString());

            // Hier kun je de ontvangen gegevens verder verwerken naar wens

            // Verbinding verbreken
            connection.disconnect();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}