package com.example.deepakjha.jamia_hamdard_app;

public class Blog {


    private String description;

    public Blog(String description, String title) {

        this.description = description;
        this.title = title;
    }

    public Blog() {

    }

    private String title;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;


    }
}