import java.util.List;

public class Utente {
    private String email;
    private String password;
    private String nome;
    private List<Carta> cartePossedute;
    private List<Carta> carteDesiderate;
    private List<Deck> deck;

    public Utente(String email, String password, String nome, List<Carta> cartePossedute, List<Carta> carteDesiderate, List<Deck> deck) {
        this.email = email;
        this.password = password;
        this.nome = nome;
        this.cartePossedute = cartePossedute;
        this.carteDesiderate = carteDesiderate;
        this.deck = deck;
    }

    // Getters and setters for the attributes

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Carta> getCartepossedute() {
        return cartePossedute;
    }

    public void setCartepossedute(List<Carta> cartepossedute) {
        this.cartePossedute = cartepossedute;
    }

    public List<Carta> getCarteDesiderate() {
        return carteDesiderate;
    }

    public void setCarteDesiderate(List<Carta> carteDesiderate) {
        this.carteDesiderate = carteDesiderate;
    }

    public List<Deck> getDeck() {
        return deck;
    }

    public void setDeck(List<Deck> deck) {
        this.deck = deck;
    }
}