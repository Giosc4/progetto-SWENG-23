package com.project.sweng;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import org.mapdb.DB;
import org.mapdb.DBMaker;
import org.mapdb.HTreeMap;

import com.project.sweng.Json.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        DB db = DBMaker.fileDB("demo_mapdb\\src\\main\\resources\\mydb.db").make();

        HTreeMap<Integer, Carta> map = (HTreeMap<Integer, Carta>) db.hashMap("myMap").createOrOpen();

        JsonReader reader = new JsonReader();

        map.clear();
        ArrayList<Carta> carte = new ArrayList<Carta>();
        ArrayList<MagicCard> carteMagic = reader.getMagicCards();
        carte.addAll(carteMagic);

        for (int i = 0; i < carteMagic.size(); i++) {
            if (i < 2) {
                map.put(i, carte.get(i));
                System.out.println(map.get(i).toString() + "\n");
            }
        }
        db.close();
    }

}