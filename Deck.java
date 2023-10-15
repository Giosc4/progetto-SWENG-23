import java.util.List;

public class Deck {
    private String nome;
    private List<Carta> carte;

    public Deck(String nome, List<Carta> carte) {
        this.nome = nome;
        this.carte = carte;
    }

    // Getters and setters for the attributes

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Carta> getCarte() {
        return carte;
    }

    public void setCarte(List<Carta> carte) {
        this.carte = carte;
    }
}