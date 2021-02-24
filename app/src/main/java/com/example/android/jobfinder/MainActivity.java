package com.example.android.jobfinder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;

import com.example.android.jobfinder.model.JobDao;
import com.example.android.jobfinder.model.JobFinderDatabase;
import com.example.android.jobfinder.model.UserDao;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {

    Executor executor = Executors.newSingleThreadExecutor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            JobFinderDatabase db = Room.databaseBuilder(getApplicationContext(),
                    JobFinderDatabase.class, "database-name").build();
        UserDao userDao = db.userDao();
        JobDao jobDao = db.jobDao();



    }
}