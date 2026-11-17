package models;

import java.util.ArrayList;

public class Internship {
    private int id;
    private String title;
    private String description;
    private String company;
    private int duration; // in months
    private int minYearLevel; // minimum year level required
    private ArrayList<String> requiredSkills;
    private ArrayList<String> relatedInterests;

    public Internship(int id, String title, String description, String company, int duration, int minYearLevel, ArrayList<String> requiredSkills, ArrayList<String> relatedInterests) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.company = company;
        this.duration = duration;
        this.minYearLevel = minYearLevel;
        this.requiredSkills = new ArrayList<>(requiredSkills); //defensive copying
        this.relatedInterests = new ArrayList<>(relatedInterests);

    }

    //Getters
    public int getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }

    public String getCompany(){
        return company;
    }

    public int getDuration(){
        return duration;
    }

    public int getMinYearLevel(){
        return minYearLevel;
    }

    public ArrayList<String> getRequiredSkills(){
        return new ArrayList<>(requiredSkills);
    }

    public ArrayList<String> getRelatedInterests(){
        return new ArrayList<>(relatedInterests);
    }

    //Setters
    public void setId(int id){
        this.id = id;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setCompany(String company){
        this.company = company;
    }

    public void setDuration(int duration){
        this.duration = duration;
    }

    public void setMinYearLevel(int minYearLevel){
        this.minYearLevel = minYearLevel;
    }

    public void setRequiredSkills(ArrayList<String> requiredSkills){
        this.requiredSkills = new ArrayList<>(requiredSkills);
    }

    public void setRelatedInterests(ArrayList<String> relatedInterests){
        this.relatedInterests = new ArrayList<>(relatedInterests);
    }

    // Validation method
    public void validate() {
        if (minYearLevel < 1 || minYearLevel > 4) {
            throw new IllegalArgumentException("Minimum year level must be between 1 and 4.");
        }
        if (duration <= 0) {
            throw new IllegalArgumentException("Duration must be positive.");
        }
    }
}
