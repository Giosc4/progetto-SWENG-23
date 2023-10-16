
package com.project.sweng;
import com.project.sweng.Json.*;
import java.util.ArrayList;

public class Scambio {
    private Utente richiedente;
    private Utente ricevente;
    private ArrayList<Carta> carteOfferte;
    private ArrayList<Carta> carteRichieste;
    private String statoProposta;

    public Scambio(Utente richiedente, Utente ricevente, ArrayList<Carta> carteOfferte, ArrayList<Carta> carteRichieste, String statoProposta) {
        this.richiedente = richiedente;
        this.ricevente = ricevente;
        this.carteOfferte = carteOfferte;
        this.carteRichieste = carteRichieste;
        this.statoProposta = statoProposta;
    }

    // Getters and setters for the attributes

    public Utente getRichiedente() {
        return richiedente;
    }

    public void setRichiedente(Utente richiedente) {
        this.richiedente = richiedente;
    }

    public Utente getRicevente() {
        return ricevente;
    }

    public void setRicevente(Utente ricevente) {
        this.ricevente = ricevente;
    }

    public ArrayList<Carta> getCarteOfferte() {
        return carteOfferte;
    }

    public void setCarteOfferte(ArrayList<Carta> carteOfferte) {
        this.carteOfferte = carteOfferte;
    }

    public ArrayList<Carta> getCarteRichieste() {
        return carteRichieste;
    }

    public void setCarteRichieste(ArrayList<Carta> carteRichieste) {
        this.carteRichieste = carteRichieste;
    }

    public String getStatoProposta() {
        return statoProposta;
    }

    public void setStatoProposta(String statoProposta) {
        this.statoProposta = statoProposta;
    }
}