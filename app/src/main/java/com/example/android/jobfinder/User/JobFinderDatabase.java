package com.example.android.jobfinder.User;

import androidx.room.Database;
import androidx.room.RoomDatabase;

public abstract class JobFinderDatabase extends RoomDatabase {
    @Database(entities = {User.class , Job.class}, version = 1)

    public abstract class AppDatabase extends RoomDatabase {
        public abstract UserDao userDao();
        public abstract JobDao jobDao();
    }
}
