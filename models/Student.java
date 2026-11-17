package models;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<String> skills;
    private ArrayList<String> interests;
    private int yearLevel;
    private int availableMonths;

    //Constructors
    public Student(String name, ArrayList<String> skills, ArrayList<String> interests, int yearLevel, int availableMonths){
        this.name = name;
        this.skills = new ArrayList<>(skills);
        this.interests = new ArrayList<>(interests);
        this.yearLevel = yearLevel;
        this.availableMonths = availableMonths;
    }

    //Getters
    public String getName(){
        return name;
    }
    public ArrayList<String> getSkills(){
        return new ArrayList<>(skills);
    }

    public ArrayList<String> getInterests(){
        return new ArrayList<>(interests);
    }
    public int getYearLevel(){
        return yearLevel;
    }
    public int getAvailableMonths(){
        return availableMonths;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }

    public void setSkills(ArrayList<String> skills){
        this.skills = new ArrayList<>(skills);
    }

    public void setInterests(ArrayList<String> interests){
        this.interests = new ArrayList<>(interests);
    }

    public void setYearLevel(int yearLevel){
        this.yearLevel = yearLevel;
    }

    public void setAvailableMonths(int availableMonths){
        this.availableMonths = availableMonths;
    }
}
