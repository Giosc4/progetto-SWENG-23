package com.project.sweng.Json;

import java.io.Serializable;

public class CartaYuGiOh extends Carta implements Serializable{
    String  type, description, race, imageUrl, smallImageUrl;

    //costruttore
    public CartaYuGiOh(String name, String type, String description, String race, String imageUrl, String smallImageUrl) {
        super(name, TipoCarta.YU_GI_OH);
        this.type = type;
        this.description=description;
        this.race=race;
        this.imageUrl=imageUrl;
        this.smallImageUrl=smallImageUrl;
    }

    //metodo toString
    public String toString() {
        String string=
                "Tipo Carta = " + TipoCarta.YU_GI_OH + '\n' +
                        "name= " + getNome() + '\n' +
                        "type= " + type + '\n' +
                        "description= " + description + '\n' +
                        "race= " + race + '\n' +
                        "imageUrl= " + imageUrl + '\n' +
                        "smallImageUrl= " + smallImageUrl + '\n' +
                        '}';
        return string;
    }

    //metodi Getter e Setter
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String text) {
        this.description = text;
    }

    public String getRace() {
        return race;
    }
    public void setrace(String race) {
        this.race = race;
    }

    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getSmallImageUrl() {
        return smallImageUrl;
    }

    public void setSmallImageUrl(String smallImageUrl) {
        this.smallImageUrl = smallImageUrl;
    }
}
