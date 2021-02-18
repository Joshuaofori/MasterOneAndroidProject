package com.example.android.jobfinder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;

import com.example.android.jobfinder.User.JobFinderDatabase;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {

    Executor executor = Executors.newSingleThreadExecutor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //executor.execute(()->{
            JobFinderDatabase db = Room.databaseBuilder(getApplicationContext(),
                    JobFinderDatabase.class, "database-name").build();
        //});


    }
}