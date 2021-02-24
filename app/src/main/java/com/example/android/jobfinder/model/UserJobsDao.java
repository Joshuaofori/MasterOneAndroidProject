package com.example.android.jobfinder.model;

import java.util.List;

import androidx.room.Query;
import androidx.room.Transaction;

public interface UserJobsDao {
    @Transaction
    @Query("SELECT * FROM User")
    public List<UserWithJobs> getUsersWithJobs();
}
