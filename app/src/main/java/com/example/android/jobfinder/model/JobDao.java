package com.example.android.jobfinder.model;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
@Dao
public interface JobDao {
    @Insert
    void insertJob(Job job);

    @Insert
    void insertAll(Job... jobs);

    @Delete
    void deleteJob(Job job);

    @Query("SELECT * FROM job")
    Job getJob();
}
