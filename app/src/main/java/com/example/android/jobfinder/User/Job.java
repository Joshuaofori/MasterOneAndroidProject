package com.example.android.jobfinder.User;

import android.location.Location;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Job {
    @PrimaryKey(autoGenerate = true)
    private long id;

    @ColumnInfo
    private float maxSalary;

    @ColumnInfo
    private float minSalary;

    @ColumnInfo
    private long employerId;

    @ColumnInfo
    private String jobTitle;

    @ColumnInfo
    private String option;

    @ColumnInfo
    private String location;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(float maxSalary) {
        this.maxSalary = maxSalary;
    }

    public float getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(float minSalary) {
        this.minSalary = minSalary;
    }

    public long getEmployerId() {
        return employerId;
    }

    public void setEmployerId(long employerId) {
        this.employerId = employerId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
