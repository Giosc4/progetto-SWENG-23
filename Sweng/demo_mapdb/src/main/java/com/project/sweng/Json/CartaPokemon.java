package com.project.sweng.Json;

import java.io.Serializable;

public class CartaPokemon extends Carta implements Serializable{
    String illustrator, image, types, rarity, description;
    boolean isFirstEdition, isHolo, isNormal, isReverse, isWPromo;

    // costruttore
    public CartaPokemon(String name, String rarity, String illustrator, String image, boolean isFirstEdition,
            boolean isHolo, boolean isNormal, boolean isReverse, boolean isWPromo, String types, String description) {
        super(name, TipoCarta.POKEMON);
        this.rarity = rarity;
        this.illustrator = illustrator;
        this.image = image;
        this.isFirstEdition = isFirstEdition;
        this.isHolo = isHolo;
        this.isNormal = isNormal;
        this.isReverse = isReverse;
        this.isWPromo = isWPromo;
        this.types = types;
        this.description = description;
    }

    // metodo toString
    public String toString() {
        String string = "Tipo Carta = " + TipoCarta.POKEMON + '\n' +
                "illustrator= " + illustrator + '\n' +
                "name= " + getNome() + '\n' +
                "rarity= " + rarity + '\n' +
                "image= " + image + '\n' +
                "isFirstEdition= " + isFirstEdition + '\n' +
                "isHolo= " + isHolo + '\n' +
                "isNormal= " + isNormal + '\n' +
                "isReverse= " + isReverse + '\n' +
                "isWPromo= " + isWPromo + '\n' +
                "types= " + types + '\n' +
                "description= " + description + '\n' +
                '}';
        return string;
    }

    // metodi Getter e Setter
    public String getIllustrator() {
        return illustrator;
    }

    public void setIllustrator(String illustrator) {
        this.illustrator = illustrator;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isFirstEdition() {
        return isFirstEdition;
    }

    public void setFirstEdition(boolean firstEdition) {
        this.isFirstEdition = firstEdition;
    }

    public boolean isHolo() {
        return isHolo;
    }

    public void setHolo(boolean holo) {
        this.isHolo = holo;
    }

    public boolean isNormal() {
        return isNormal;
    }

    public void setNormal(boolean normal) {
        this.isNormal = normal;
    }

    public boolean isReverse() {
        return isReverse;
    }

    public void setReverse(boolean reverse) {
        this.isReverse = reverse;
    }

    public boolean iswPromo() {
        return isWPromo;
    }

    public void setwPromo(boolean wPromo) {
        this.isWPromo = wPromo;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}