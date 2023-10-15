import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Carta> catalogo;

    public static void memorizzaCarteYuGiOh(InputStream inputStream) {
        JSONArray jsonArray = new JSONArray();

        //ArrayList di Carte YuGiOh
        ArrayList<CartaYuGiOh> carteYuGiOh = new ArrayList<>();

        Scanner scanner = new Scanner(inputStream).useDelimiter("\\A");
        if (scanner.hasNext()) {
            String jsonString = scanner.next();

            // Crea un array JSON dalla stringa
            jsonArray = new JSONArray(jsonString);

            // Itera attraverso l'array JSON e stampa i dati
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject cardObject = jsonArray.getJSONObject(i);

                // Estrai i campi dal JSON
                String name = cardObject.getString("name");
                String type = cardObject.getString("type");
                String description = cardObject.getString("desc");
                String race = cardObject.getString("race");
                String imageUrl = cardObject.getString("image_url");
                String smallImageUrl = cardObject.getString("small_image_url");

                //crea la carta
                CartaYuGiOh carta= new CartaYuGiOh(name, type, description, race, imageUrl, smallImageUrl);
                carteYuGiOh.add(carta);
                catalogo.add(carta);

                //stampa la carta
               // System.out.println("Carta YuGiOh numero: " + (i+1) + '\n' + "{ " + '\n' + carteYuGiOh.get(i).toString());
                //System.out.println("---------------------------------");
            }
        }
        scanner.close();
    }

    public static void memorizzaCartePokemon(InputStream inputStream) {
        JSONArray jsonArray = new JSONArray();
        Scanner scanner = new Scanner(inputStream).useDelimiter("\\A");

        //ArrayList di Carte YuGiOh
        ArrayList<CartaPokemon> cartePokemon = new ArrayList<>();

        if (scanner.hasNext()) {
            String jsonString = scanner.next();

            // Crea un array JSON dalla stringa
            jsonArray = new JSONArray(jsonString);

            // Itera attraverso l'array JSON e stampa i dati
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject cardObject = jsonArray.getJSONObject(i);

                // Estrai i campi dal JSON
                String illustrator = cardObject.optString("illustrator", "N/A");
                String image = cardObject.optString("image", "N/A");
                String name = cardObject.optString("name", "N/A");
                String rarity = cardObject.optString("rarity", "N/A");
                String type = cardObject.optString("types", "N/A");

                // Estrai il sotto-oggetto 'variants' e i relativi campi solo se non è null
                JSONObject variantsObject = cardObject.optJSONObject("variants");
                boolean isFirstEdition= false;
                boolean isHolo= false;
                boolean isNormal= false;
                boolean isReverse= false;
                boolean isWPromo= false;

                if (variantsObject != null) {
                    isFirstEdition = variantsObject.optBoolean("firstEdition", false);
                    isHolo = variantsObject.optBoolean("holo", false);
                    isNormal = variantsObject.optBoolean("normal", false);
                    isReverse = variantsObject.optBoolean("reverse", false);
                    isWPromo = variantsObject.optBoolean("wPromo", false);
                }

                // Estrai la lista dei tipi della carta, se presente
                JSONArray typesArray = cardObject.optJSONArray("types");
                StringBuilder types = new StringBuilder();
                if (typesArray != null) {
                    for (int j = 0; j < typesArray.length(); j++) {
                        types.append(typesArray.getString(j)).append(", ");
                    }
                    // Rimuovi l'ultima virgola e spazio dalla lista dei tipi
                    if (types.length() > 2) {
                        types.setLength(types.length() - 2);
                    }
                } else {
                    types.append("N/A");
                }

                // Estrai la descrizione (se presente)
                String description = cardObject.optString("description", "N/A");

                //crea la carta
                CartaPokemon carta= new CartaPokemon(illustrator, image, name, rarity, isFirstEdition, isHolo, isNormal, isReverse, isWPromo, type);
                cartePokemon.add(carta);
                catalogo.add(carta);

                //stampa la carta
               // System.out.println("Carta Pokemon numero: " + (i+1) + '\n' + "{ " + '\n' + cartePokemon.get(i).toString());
              //  System.out.println("---------------------------------");
            }
        }
        scanner.close();
    }


    public static void memorizzaCarteMagic(InputStream inputStream) {
        JSONArray jsonArray = new JSONArray();
        Scanner scanner = new Scanner(inputStream).useDelimiter("\\A");

        //ArrayList di Carte Magic
        ArrayList<CartaMagic> carteMagic = new ArrayList<>();

        if (scanner.hasNext()) {
            String jsonString = scanner.next();

            // Crea un array JSON dalla stringa
            jsonArray = new JSONArray(jsonString);

            // Itera attraverso l'array JSON e stampa i dati
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject cardObject = jsonArray.getJSONObject(i);

                // Estrai i campi dal JSON
                String artist = cardObject.getString("artist");
                String name = cardObject.getString("name");
                String text = cardObject.getString("text");
                String types = cardObject.getString("types");
                String rarity = cardObject.getString("rarity");
                String hasFoil = cardObject.getString("hasFoil");
                String isAlternative = cardObject.getString("isAlternative");
                String isFullArt = cardObject.getString("isFullArt");
                String isPromo = cardObject.getString("isPromo");
                String isReprint = cardObject.getString("isReprint");

                //crea la carta
                CartaMagic carta= new CartaMagic(artist, name, text, types, rarity, hasFoil, isAlternative, isFullArt, isPromo, isReprint);
                carteMagic.add(carta);
                catalogo.add(carta);

                //stampa i dati della carta
              //  System.out.println("Carta Magic numero: " + (i+1) + '\n' + "{ " + '\n' + carteMagic.get(i).toString());
              //  System.out.println("---------------------------------");
            }
        }
        scanner.close();
    }

    public static void stampaCatalogo(ArrayList<Carta> catalogo) {
        for (int i = 0; i < catalogo.size(); i++) {
            System.out.println("Carta numero: " + (i+1) + '\n' + "{ " + '\n' + catalogo.get(i).toString());
            System.out.println("---------------------------------");
        }
    }


    public static void main(String[] args) {

        catalogo = new ArrayList<>();

        // Ottieni il percorso del file come risorsa dal classpath
        InputStream magicCards = Main.class.getClassLoader().getResourceAsStream("magic_cards.json");
        InputStream pokemonCards = Main.class.getClassLoader().getResourceAsStream("pokemon_cards.json");
        InputStream yugiohCards = Main.class.getClassLoader().getResourceAsStream("yugioh_cards.json");


        // Verifica se il file è stato trovato
        if (magicCards != null) {
            memorizzaCarteMagic(magicCards);
        } else {
            System.out.println("Impossibile trovare il catalogo delle carte Magic");
        }
        if (pokemonCards != null) {
            memorizzaCartePokemon(pokemonCards);
        } else {
            System.out.println("Impossibile trovare il catalogo delle carte Pokemon");
        }
        if (yugiohCards != null) {
            memorizzaCarteYuGiOh(yugiohCards);
        } else {
            System.out.println("Impossibile trovare il catalogo delle carte YuGiOh");
        }
        stampaCatalogo(catalogo);
    }
}