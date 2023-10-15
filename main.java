import java.io.InputStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Ottieni l'InputStream per i file JSON delle carte YuGiOh, Pokemon e Magic
            InputStream yugiohCards = Main.class.getClassLoader().getResourceAsStream("yugioh_cards.json");
            InputStream pokemonCards = Main.class.getClassLoader().getResourceAsStream("pokemon_cards.json");
            InputStream magicCards = Main.class.getClassLoader().getResourceAsStream("magic_cards.json");

            // Crea un'istanza di JsonReader
            JsonReader jsonReader = new JsonReader();

            // Memorizza le carte YuGiOh nel catalogo
            jsonReader.memorizzaCarteYuGiOh(yugiohCards);

            // Memorizza le carte Pokemon nel catalogo
            jsonReader.memorizzaCartePokemon(pokemonCards);

            // Memorizza le carte Magic nel catalogo
            jsonReader.memorizzaCarteMagic(magicCards);

            // Ottieni il catalogo delle carte
            ArrayList<Carta> catalogo = jsonReader.getCatalogo();

            // Stampa il catalogo
            jsonReader.stampaCatalogo(catalogo);
        } catch (Exception e) {
            System.out.println("Impossibile trovare il catalogo delle carte");
        }
    }
}
