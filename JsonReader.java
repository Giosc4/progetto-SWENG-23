import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class JsonReader {
    private ArrayList<Carta> catalogo;

    //costruttore
    public JsonReader() {
        catalogo = new ArrayList<>();
    }

    public void memorizzaCarteYuGiOh(InputStream inputStream) {
        Gson gson = new Gson();
        Scanner scanner = new Scanner(new InputStreamReader(inputStream)).useDelimiter("\\A");

        if (scanner.hasNext()) {
            String jsonString = scanner.next();

            // Converte la stringa JSON in un array di oggetti JSON
            JsonArray jsonArray = gson.fromJson(jsonString, JsonArray.class);

            // Itera attraverso l'array JSON e deserializza gli oggetti
            for (JsonElement jsonElement : jsonArray) {
                JsonObject cardObject = jsonElement.getAsJsonObject();

                // Estrai i campi dal JSON
                String name = cardObject.get("name").getAsString();
                String type = cardObject.get("type").getAsString();
                String description = cardObject.get("desc").getAsString();
                String race = cardObject.get("race").getAsString();
                String imageUrl = cardObject.get("image_url").getAsString();
                String smallImageUrl = cardObject.get("small_image_url").getAsString();

                // Crea la carta e aggiungila al catalogo
                CartaYuGiOh carta = new CartaYuGiOh(name, type, description, race, imageUrl, smallImageUrl);
                catalogo.add(carta);
            }
        }
        scanner.close();
    }

    public void memorizzaCartePokemon(InputStream inputStream) {
        Gson gson = new Gson();
        Scanner scanner = new Scanner(new InputStreamReader(inputStream)).useDelimiter("\\A");

        if (scanner.hasNext()) {
            String jsonString = scanner.next();

            // Converte la stringa JSON in un array di oggetti JSON
            JsonArray jsonArray = gson.fromJson(jsonString, JsonArray.class);

            // Itera attraverso l'array JSON e deserializza gli oggetti
            for (JsonElement jsonElement : jsonArray) {
                JsonObject cardObject = jsonElement.getAsJsonObject();

                // Estrai i campi dal JSON
                String illustrator = cardObject.has("illustrator") ? cardObject.get("illustrator").getAsString() : "N/A";
                String image = cardObject.has("image") ? cardObject.get("image").getAsString() : "N/A";
                String name = cardObject.has("name") ? cardObject.get("name").getAsString() : "N/A";
                String rarity = cardObject.has("rarity") ? cardObject.get("rarity").getAsString() : "N/A";
                String types = cardObject.has("types") ? cardObject.get("types").getAsString() : "N/A";
                String description = cardObject.has("description") ? cardObject.get("description").getAsString() : "N/A";

                // Estrai il sotto-oggetto 'variants' e i relativi campi solo se non è null
                JsonObject variants = cardObject.getAsJsonObject("variants");
                boolean isFirstEdition = variants.has("firstEdition") ? variants.get("firstEdition").getAsBoolean() : false;
                boolean isHolo = variants.has("holo") ? variants.get("holo").getAsBoolean() : false;
                boolean isNormal = variants.has("normal") ? variants.get("normal").getAsBoolean() : false;
                boolean isReverse = variants.has("reverse") ? variants.get("reverse").getAsBoolean() : false;
                boolean isWPromo = variants.has("wPromo") ? variants.get("wPromo").getAsBoolean() : false;

                // Crea la carta e aggiungila al catalogo
                CartaPokemon carta = new CartaPokemon(name, rarity, illustrator, image, isFirstEdition, isHolo, isNormal, isReverse, isWPromo, types, description);
                catalogo.add(carta);
            }
        }
        scanner.close();
    }

    public void memorizzaCarteMagic(InputStream inputStream) {
        Gson gson = new Gson();
        Scanner scanner = new Scanner(new InputStreamReader(inputStream)).useDelimiter("\\A");

        if (scanner.hasNext()) {
            String jsonString = scanner.next();

            // Converte la stringa JSON in un array di oggetti JSON
            JsonArray jsonArray = gson.fromJson(jsonString, JsonArray.class);

            // Itera attraverso l'array JSON e deserializza gli oggetti
            for (JsonElement jsonElement : jsonArray) {
                JsonObject cardObject = jsonElement.getAsJsonObject();

                // Estrai i campi dal JSON
                String artist = cardObject.get("artist").getAsString();
                String name = cardObject.get("name").getAsString();
                String text = cardObject.get("text").getAsString();
                String types = cardObject.get("types").getAsString();
                String rarity = cardObject.get("rarity").getAsString();
                boolean hasFoil = cardObject.get("hasFoil").getAsBoolean();
                boolean isAlternative = cardObject.get("isAlternative").getAsBoolean();
                boolean isFullArt = cardObject.get("isFullArt").getAsBoolean();
                boolean isPromo = cardObject.get("isPromo").getAsBoolean();
                boolean isReprint = cardObject.get("isReprint").getAsBoolean();

                // Crea la carta e aggiungila al catalogo
                CartaMagic carta = new CartaMagic(name, rarity, artist, text, types, hasFoil, isAlternative, isFullArt, isPromo, isReprint);
                catalogo.add(carta);
            }
        }
        scanner.close();
    }

    //stampa il catalogo delle carte
    public void stampaCatalogo(ArrayList<Carta> catalogo) {
        for (int i = 0; i < catalogo.size(); i++) {
            System.out.println("Carta numero: " + (i + 1) + '\n' + "{ " + '\n' + catalogo.get(i).toString());
            System.out.println("---------------------------------");
        }
    }

    //ricevi il catalogo delle carte
    public ArrayList<Carta> getCatalogo() {
        return catalogo;
    }
}
