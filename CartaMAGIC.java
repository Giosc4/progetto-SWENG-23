public class CartaMAGIC extends Carta {
    private String descrizione;
    private String artista;
    private boolean hasFoil;
    private boolean isAlternative;
    private boolean isFullArt;
    private boolean isPromo;
    private boolean isReprint;

    public CartaMAGIC(String nome, String tipo, String descrizione, String artista, String rarita, boolean hasFoil, boolean isAlternative, boolean isFullArt, boolean isPromo, boolean isReprint) {
        super(nome, TipoCarta.MAGIC, rarita);
        this.descrizione = descrizione;
        this.artista = artista;
        this.hasFoil = hasFoil;
        this.isAlternative = isAlternative;
        this.isFullArt = isFullArt;
        this.isPromo = isPromo;
        this.isReprint = isReprint;
    }

    // Getters and setters for the attributes

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public boolean isHasFoil() {
        return hasFoil;
    }

    public void setHasFoil(boolean hasFoil) {
        this.hasFoil = hasFoil;
    }

    public boolean isAlternative() {
        return isAlternative;
    }

    public void setAlternative(boolean isAlternative) {
        this.isAlternative = isAlternative;
    }

    public boolean isFullArt() {
        return isFullArt;
    }

    public void setFullArt(boolean isFullArt) {
        this.isFullArt = isFullArt;
    }

    public boolean isPromo() {
        return isPromo;
    }

    public void setPromo(boolean isPromo) {
        this.isPromo = isPromo;
    }

    public boolean isReprint() {
        return isReprint;
    }

    public void setReprint(boolean isReprint) {
        this.isReprint = isReprint;
    }
}
