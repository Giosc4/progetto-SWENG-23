package com.project.sweng.Json;

import java.io.Serializable;

public class CartaMagic extends Carta implements Serializable {
    String artist, text, rarity, type;
    boolean hasFoil, isAlternative, isFullArt, isPromo, isReprint;

    // costruttore
    public CartaMagic(String name, String rarity, String artist, String text, String type, boolean hasFoil,
            boolean isAlternative, boolean isFullArt, boolean isPromo, boolean isReprint) {
        super(name, TipoCarta.MAGIC);
        this.rarity = rarity;
        this.artist = artist;
        this.text = text;
        this.type = type;
        this.hasFoil = hasFoil;
        this.isAlternative = isAlternative;
        this.isFullArt = isFullArt;
        this.isPromo = isPromo;
        this.isReprint = isReprint;
    }

    // metodo toString
    public String toString() {
        String string = "Tipo Carta = " + TipoCarta.MAGIC + '\n' +
                "artist= " + artist + '\n' +
                "name= " + getNome() + '\n' +
                "text= " + text + '\n' +
                "types= " + type + '\n' +
                "rarity= " + rarity + '\n' +
                "hasFoil= " + hasFoil + '\n' +
                "isAlternative= " + isAlternative + '\n' +
                "isFullArt= " + isFullArt + '\n' +
                "isPromo= " + isPromo + '\n' +
                "isReprint= " + isReprint + '\n' +
                '}';
        return string;
    }

    // metodi Getter e Setter
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
        return type;
    }

    public void setTypes(String type) {
        this.type = type;
    }

    public boolean getHasFoil() {
        return hasFoil;
    }

    public void setHasFoil(boolean hasFoil) {
        this.hasFoil = hasFoil;
    }

    public boolean getIsAlternative() {
        return isAlternative;
    }

    public void setIsAlternative(boolean isAlternative) {
        this.isAlternative = isAlternative;
    }

    public boolean getIsFullArt() {
        return isFullArt;
    }

    public void setIsFullArt(boolean isFullArt) {
        this.isFullArt = isFullArt;
    }

    public boolean getIsPromo() {
        return isPromo;
    }

    public void setIsPromo(boolean isPromo) {
        this.isPromo = isPromo;
    }

    public boolean getIsReprint() {
        return isReprint;
    }

    public void setIsReprint(boolean isReprint) {
        this.isReprint = isReprint;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }
}