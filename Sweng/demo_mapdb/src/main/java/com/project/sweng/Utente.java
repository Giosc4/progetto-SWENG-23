package com.project.sweng;

import com.project.sweng.Json.*;
import java.util.ArrayList;

public class Utente {
    private String email;
    private String password;
    private String nome;
    private ArrayList<Carta> cartePossedute;
    private ArrayList<Carta> carteDesiderate;
    private ArrayList<Deck> deck;

    public Utente(String email, String password, String nome, ArrayList<Carta> cartePossedute, ArrayList<Carta> carteDesiderate,
            ArrayList<Deck> deck) {
        this.email = email;
        this.password = password;
        this.nome = nome;
        this.cartePossedute = cartePossedute;
        this.carteDesiderate = carteDesiderate;
        this.deck = deck;
    }

    // Getters and setters for the attributes

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Carta> getCartepossedute() {
        return cartePossedute;
    }

    public void setCartepossedute(ArrayList<Carta> cartepossedute) {
        this.cartePossedute = cartepossedute;
    }

    public ArrayList<Carta> getCarteDesiderate() {
        return carteDesiderate;
    }

    public void setCarteDesiderate(ArrayList<Carta> carteDesiderate) {
        this.carteDesiderate = carteDesiderate;
    }

    public ArrayList<Deck> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Deck> deck) {
        this.deck = deck;
    }
}