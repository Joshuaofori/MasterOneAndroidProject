package com.example.android.jobfinder.User;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {User.class , Job.class}, version = 1)
public abstract class JobFinderDatabase extends RoomDatabase {

        public abstract UserDao userDao();
        public abstract JobDao jobDao();
    }

