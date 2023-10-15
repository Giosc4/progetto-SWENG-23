import java.util.List;

public class Applicazione {
    private List<Utente> utenti;
    private Catalogo catalogo;

    public Applicazione(List<Utente> utenti, Catalogo catalogo) {
        this.utenti = utenti;
        this.catalogo = catalogo;
    }

    // Getters and setters for the attributes

    public List<Utente> getUtenti() {
        return utenti;
    }

    public void setUtenti(List<Utente> utenti) {
        this.utenti = utenti;
    }

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }
}