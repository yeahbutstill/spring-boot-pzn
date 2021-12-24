package com.yeahbutstill.learnspring.singleton;

public class Database {
    private  static Database database;

    public static Database getDatabase() {
        if (database == null) {
            database = new Database();
        }
        return database;
    }

    public Database() {
        // tidak dapat membuat instance kelas database
    }
}
