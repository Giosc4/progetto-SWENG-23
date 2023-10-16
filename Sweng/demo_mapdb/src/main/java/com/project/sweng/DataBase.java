package com.project.sweng;

import java.util.ArrayList;
import java.util.Map;

import org.mapdb.DB;
import org.mapdb.DBMaker;

import com.project.sweng.Json.*;

public class DataBase {
    DB db;

    Map<Integer, Utente> mapUsers;
    ArrayList<Utente> users;

    Map<Integer, Carta> mapCards;
    ArrayList<Carta> carte;

    Map<Integer, Scambio> mapScambi;
    ArrayList<Scambio> scambi;

    public DataBase() {
        db = DBMaker.fileDB("demo_mapdb\\src\\main\\resources\\myDatabase.db").make();
        mapUsers = (Map<Integer, Utente>) db.hashMap("users").createOrOpen();
        mapCards = (Map<Integer, Carta>) db.hashMap("cards").createOrOpen();
        mapScambi = (Map<Integer, Scambio>) db.hashMap("scambi").createOrOpen();
    }

    // for USERS database
    public void initDatabase_user() {
        if (mapUsers.isEmpty()) {
            users = new ArrayList<Utente>();
        } else {
            users = new ArrayList<Utente>(mapUsers.values());
        }
    }

    public String stampUsers() {
        String str = " ";
        if (this.mapUsers == null || mapUsers.isEmpty()) {
            str = "No users in the database";
        } else {
            for (int j = 0; j < mapUsers.size(); j++) {
                str += mapUsers.get(j).toString() + "\n\n";
            }
        }
        return str;
    }

    // for CARDS database
    public void initDatabase_cards() {
        // get cards from json file
        JsonReader reader = new JsonReader();
        if (mapCards == null || mapCards.isEmpty()) {
            carte = reader.getCatalogo();
            // put cards in the database
            for (int i = 0; i < carte.size(); i++) {
                mapCards.put(i, carte.get(i));
            }
        }
    }

    public String stampCatalogo() {
        String str = " ";
        if (mapCards == null || mapCards.isEmpty()) {
            str = "No cards in the database";
        } else {
            for (int j = 0; j < mapCards.size(); j++) {
                str += mapCards.get(j).toString() + "\n\n";
            }
        }
        return str;
    }

    // for SCAMBI database
    public void initDatabase_scambio() {
        if (mapScambi.isEmpty()) {
            scambi = new ArrayList<Scambio>();
        } else {
            scambi = new ArrayList<Scambio>(mapScambi.values());
        }
    }

    public String stampScambi() {
        String str = " ";
        if (this.mapScambi == null || mapScambi.isEmpty()) {
            str = "No scambi in the database";
        } else {
            for (int j = 0; j < mapScambi.size(); j++) {
                str += mapScambi.get(j).toString() + "\n\n";
            }
        }
        return str;
    }

    public void closeDB() {
        db.close();
    }
}
