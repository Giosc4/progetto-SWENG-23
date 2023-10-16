package com.project.sweng;

import com.project.sweng.Json.*;

import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Carta> carteDisponibili;

    public Catalogo(ArrayList<Carta> carteDisponibili) {
        this.carteDisponibili = carteDisponibili;
    }

    // Getters and setters for the attribute

    public ArrayList<Carta> getCarteDisponibili() {
        return carteDisponibili;
    }

    public void setCarteDisponibili(ArrayList<Carta> carteDisponibili) {
        this.carteDisponibili = carteDisponibili;
    }
}