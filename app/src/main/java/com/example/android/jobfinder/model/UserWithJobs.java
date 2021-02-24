package com.example.android.jobfinder.model;

import java.util.List;

import androidx.room.Embedded;
import androidx.room.Relation;

public class UserWithJobs {
    @Embedded
    public User user;
    @Relation(
            parentColumn = "userId",
            entityColumn = "userCreatorId"
    )
    public List<Job> jobLists;
}
