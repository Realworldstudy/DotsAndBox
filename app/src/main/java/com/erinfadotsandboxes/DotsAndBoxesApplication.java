package com.erinfadotsandboxes;

import android.app.Application;

import com.erinfadotsandboxes.database.GameScoreDatabase;

import androidx.room.Room;
import timber.log.Timber;


public class DotsAndBoxesApplication extends Application {
    public GameScoreDatabase db;

    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());

        db = Room.databaseBuilder(getApplicationContext(),
                GameScoreDatabase.class, "dotsandboxes").allowMainThreadQueries().build();

    }

    public GameScoreDatabase getDb() {
        return db;
    }
}
