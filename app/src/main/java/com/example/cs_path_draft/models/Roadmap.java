package com.example.cs_path_draft.models;

public class Roadmap {
    private final String name;
    private final String url;
    private final String description;

    public Roadmap(String name, String url, String description){
        if (name == null || url == null || description == null){
            throw new IllegalArgumentException("Missing Input");
        }

        this.name = name;
        this.url = url;
        this.description = description;
    }

    //Getters

    public String getName(){
        return name;
    }

    public String getUrl(){
        return url;
    }

    public String getDescription(){
        return description;
    }

}