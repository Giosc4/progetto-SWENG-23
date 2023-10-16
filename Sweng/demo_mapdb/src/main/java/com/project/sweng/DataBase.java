package com.project.sweng;

import java.util.ArrayList;
import java.util.Map;

import org.mapdb.DB;
import org.mapdb.DBMaker;
import org.mapdb.HTreeMap;

import com.project.sweng.Json.*;

public class DataBase {
    DB db;

    HTreeMap<Integer, Utente> mapUsers;
    ArrayList<Utente> users;

    HTreeMap<Integer, Carta> mapCards;
    JsonReader reader;
    ArrayList<Carta> carte;

    public DataBase() {

    }

    // for users database
    public void initDatabase_user() {
        db = DBMaker.fileDB("demo_mapdb\\src\\main\\resources\\users.db").make();
        mapUsers = (HTreeMap<Integer, Utente>) db.hashMap("users").createOrOpen();
    }

    // for cards database
    public void initDatabase_cards() {
        db = DBMaker.fileDB("demo_mapdb\\src\\main\\resources\\cards.db").make();
        mapCards = (HTreeMap<Integer, Carta>) db.hashMap("cards").createOrOpen();
        reader = new JsonReader();
        carte = reader.getCatalogo();
        mapCards.clear();
        for (int i = 0; i < carte.size(); i++) {
            mapCards.put(i, carte.get(i));
        }
    }


    public String stampCatalogo() {
        String str = " ";

        for (int j = 0; j < mapCards.size(); j++) {
            str += mapCards.get(j).toString() + "\n\n";
        }
        return str;
    }

    public void closeDatabase() {
        db.close();
    }
}
