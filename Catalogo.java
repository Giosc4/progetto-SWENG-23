import java.util.List;

public class Catalogo {
    private List<Carta> carteDisponibili;

    public Catalogo(List<Carta> carteDisponibili) {
        this.carteDisponibili = carteDisponibili;
    }

    // Getters and setters for the attribute

    public List<Carta> getCarteDisponibili() {
        return carteDisponibili;
    }

    public void setCarteDisponibili(List<Carta> carteDisponibili) {
        this.carteDisponibili = carteDisponibili;
    }
}