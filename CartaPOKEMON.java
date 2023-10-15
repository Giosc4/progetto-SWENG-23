public class CartaPOKEMON extends Carta {
    private String illustratore;
    private String image;
    private VariantePokemon variante;

    public CartaPOKEMON(String nome, String tipo, String illustratore, String image, String rarita, VariantePokemon variante) {
        super(nome, TipoCarta.POKEMON, rarita);
        this.illustratore = illustratore;
        this.image = image;
        this.variante = variante;
    }

    // Getters and setters for the attributes

    public String getIllustratore() {
        return illustratore;
    }

    public void setIllustratore(String illustratore) {
        this.illustratore = illustratore;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public VariantePokemon getVariante() {
        return variante;
    }

    public void setVariante(VariantePokemon variante) {
        this.variante = variante;
    }
}
