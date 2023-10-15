package com.project.sweng.Json;

public abstract class Carta {
    private String name;
    private String type;
    private String rarity;

    public Carta(String name, String type, String rarity) {

        this.name = name;
        this.type = type;
        this.rarity = rarity;
    }

    // Metodi getter e setter per le variabili di istanza

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    @Override
    public String toString() {
        return "Carta [name=" + name + ", type=" + type + ", rarity=" + rarity + "]";
    }

    

    
}