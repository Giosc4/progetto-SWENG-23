public class CartaYuGiOh extends Carta {
    private String descrizione;
    private String imageURL;
    private String smallImageURL;

    public CartaYuGiOh(String nome, String tipo, String descrizione, String imageURL, String smallImageURL, String rarita) {
        super(nome, tipo, rarita);
        this.descrizione = descrizione;
        this.imageURL = imageURL;
        this.smallImageURL = smallImageURL;
    }

    // Getters and setters for the attributes

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getSmallImageURL() {
        return smallImageURL;
    }

    public void setSmallImageURL(String smallImageURL) {
        this.smallImageURL = smallImageURL;
    }

    
}