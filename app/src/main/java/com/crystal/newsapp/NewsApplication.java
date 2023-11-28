package com.crystal.newsapp;

import android.app.Application;

import androidx.room.Room;

import com.crystal.newsapp.database.NewsDatabase;

public class NewsApplication extends Application {
    private static NewsDatabase database;

    @Override
    public void onCreate() {
        super.onCreate();

        database = Room.databaseBuilder(this, NewsDatabase.class, "news_db").build();
    }

    public static NewsDatabase getDatabase() {
        return database;
    }

}
