public class CartaMagic extends Carta{
    String artist, text, rarity, types, hasFoil, isAlternative, isFullArt, isPromo, isReprint;


    //costruttore
    public CartaMagic(String name, String rarity, String artist, String text, String types,  String hasFoil, String isAlternative, String isFullArt, String isPromo, String isReprint) {
        super(name, TipoCarta.MAGIC);
        this.rarity = rarity;
        this.artist = artist;
        this.text = text;
        this.types = types;
        this.hasFoil = hasFoil;
        this.isAlternative = isAlternative;
        this.isFullArt = isFullArt;
        this.isPromo = isPromo;
        this.isReprint = isReprint;
    }

    //metodo toString
    public String toString() {
        String string=
                "Tipo Carta = " + TipoCarta.MAGIC + '\n' +
                        "artist= " + artist + '\n' +
                        "name= " + getNome() + '\n' +
                        "text= " + text + '\n' +
                        "types= " + types + '\n' +
                        "rarity= " + rarity + '\n' +
                        "hasFoil= " + hasFoil + '\n' +
                        "isAlternative= " + isAlternative + '\n' +
                        "isFullArt= " + isFullArt + '\n' +
                        "isPromo= " + isPromo + '\n' +
                        "isReprint= " + isReprint + '\n' +
                        '}';
        return string;
    }

    //metodi Getter e Setter
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getHasFoil() {
        return hasFoil;
    }

    public void setHasFoil(String hasFoil) {
        this.hasFoil = hasFoil;
    }

    public String getIsAlternative() {
        return isAlternative;
    }

    public void setIsAlternative(String isAlternative) {
        this.isAlternative = isAlternative;
    }

    public String getIsFullArt() {
        return isFullArt;
    }

    public void setIsFullArt(String isFullArt) {
        this.isFullArt = isFullArt;
    }

    public String getIsPromo() {
        return isPromo;
    }

    public void setIsPromo(String isPromo) {
        this.isPromo = isPromo;
    }

    public String getIsReprint() {
        return isReprint;
    }

    public void setIsReprint(String isReprint) {
        this.isReprint = isReprint;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }
}