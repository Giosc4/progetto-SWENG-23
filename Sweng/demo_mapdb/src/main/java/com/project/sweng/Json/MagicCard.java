package com.project.sweng.Json;

import java.io.Serializable;

public class MagicCard extends Carta implements Serializable {
    private String artist;
    private String text;
    private int hasFoil;
    private int isAlternative;
    private int isFullArt;
    private int isPromo;
    private int isReprint;

    public MagicCard(String name, String type, String rarity, String artist, String text, int hasFoil,
            int isAlternative, int isFullArt, int isPromo, int isReprint) {
        super(name, type, rarity);
        this.artist = artist;
        this.text = text;
        this.hasFoil = hasFoil;
        this.isAlternative = isAlternative;
        this.isFullArt = isFullArt;
        this.isPromo = isPromo;
        this.isReprint = isReprint;
    }

    // Metodi getter e setter per le variabili di istanza

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

    public int getHasFoil() {
        return hasFoil;
    }

    public void setHasFoil(int hasFoil) {
        this.hasFoil = hasFoil;
    }

    public int getIsAlternative() {
        return isAlternative;
    }

    public void setIsAlternative(int isAlternative) {
        this.isAlternative = isAlternative;
    }

    public int getIsFullArt() {
        return isFullArt;
    }

    public void setIsFullArt(int isFullArt) {
        this.isFullArt = isFullArt;
    }

    public int getIsPromo() {
        return isPromo;
    }

    public void setIsPromo(int isPromo) {
        this.isPromo = isPromo;
    }

    public int getIsReprint() {
        return isReprint;
    }

    public void setIsReprint(int isReprint) {
        this.isReprint = isReprint;
    }

    @Override
    public String toString() {
        String str = "MagicCard [name=" + getName() + ", type=" + getType() + ", rarity=" + getRarity()
                + ", artist=" + artist + ", text=" + text + ", hasFoil=" + hasFoil
                + ", isAlternative=" + isAlternative + ", isFullArt=" + isFullArt
                + ", isPromo=" + isPromo + ", isReprint=" + isReprint + "]";

        return str;
    }

}
