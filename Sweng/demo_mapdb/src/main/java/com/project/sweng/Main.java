package com.project.sweng;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // it my take long time to create database
        DataBase db = new DataBase();
        db.initDatabase_cards();
        db.initDatabase_user();
        db.initDatabase_scambio();

        db.stampCatalogo();
        System.out.println();
        System.out.println(db.stampUsers());
        System.out.println(db.stampScambi());
        db.closeDB();
    }
}