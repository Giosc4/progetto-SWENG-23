
package com.project.sweng;

import java.util.ArrayList;
import com.project.sweng.Json.*;

public class Deck {
    private String nome;
    private ArrayList<Carta> carte;

    public Deck(String nome, ArrayList<Carta> carte) {
        this.nome = nome;
        this.carte = carte;
    }

    // Getters and setters for the attributes

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Carta> getCarte() {
        return carte;
    }

    public void setCarte(ArrayList<Carta> carte) {
        this.carte = carte;
    }
}