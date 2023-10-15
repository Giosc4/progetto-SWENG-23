import java.util.List;

public class Scambio {
    private Utente richiedente;
    private Utente ricevente;
    private List<Carta> carteOfferte;
    private List<Carta> carteRichieste;
    private String statoProposta;

    public Scambio(Utente richiedente, Utente ricevente, List<Carta> carteOfferte, List<Carta> carteRichieste, String statoProposta) {
        this.richiedente = richiedente;
        this.ricevente = ricevente;
        this.carteOfferte = carteOfferte;
        this.carteRichieste = carteRichieste;
        this.statoProposta = statoProposta;
    }

    // Getters and setters for the attributes

    public Utente getRichiedente() {
        return richiedente;
    }

    public void setRichiedente(Utente richiedente) {
        this.richiedente = richiedente;
    }

    public Utente getRicevente() {
        return ricevente;
    }

    public void setRicevente(Utente ricevente) {
        this.ricevente = ricevente;
    }

    public List<Carta> getCarteOfferte() {
        return carteOfferte;
    }

    public void setCarteOfferte(List<Carta> carteOfferte) {
        this.carteOfferte = carteOfferte;
    }

    public List<Carta> getCarteRichieste() {
        return carteRichieste;
    }

    public void setCarteRichieste(List<Carta> carteRichieste) {
        this.carteRichieste = carteRichieste;
    }

    public String getStatoProposta() {
        return statoProposta;
    }

    public void setStatoProposta(String statoProposta) {
        this.statoProposta = statoProposta;
    }
}