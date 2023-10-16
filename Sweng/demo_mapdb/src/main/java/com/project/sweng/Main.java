package com.project.sweng;

public class Main {

    public static void main(String[] args) {
        DataBase db = new DataBase();
        db.initDatabase_cards();
        System.out.println(db.stampCatalogo());
        db.closeDatabase();
    }
}