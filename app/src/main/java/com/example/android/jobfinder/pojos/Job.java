package com.example.android.jobfinder.pojos;

import com.google.gson.annotations.SerializedName;

public class Job {
    @SerializedName("id")
    private String id;
    @SerializedName("description")
    private String description;
    @SerializedName("location")
    private String location;
    private boolean fullTime;
    @SerializedName("title")
    private String title;
    @SerializedName("url")
    private String url;
    @SerializedName("company")
    private String company;
    @SerializedName("created_at")
    private String created_at;
    @SerializedName("company_url")
    private String company_url;
    @SerializedName("type")
    private String type;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getCompany_url() {
        return company_url;
    }

    public void setCompany_url(String company_url) {
        this.company_url = company_url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isFullTime() {
        return fullTime;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", fullTime=" + fullTime +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", company='" + company + '\'' +
                ", created_at='" + created_at + '\'' +
                ", company_url='" + company_url + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
