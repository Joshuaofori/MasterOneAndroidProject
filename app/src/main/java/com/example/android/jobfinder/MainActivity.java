package com.example.android.jobfinder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;

import com.example.android.jobfinder.User.JobFinderDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JobFinderDatabase db = Room.databaseBuilder(getApplicationContext(),
                JobFinderDatabase.class, "database-name").build();
    }
}