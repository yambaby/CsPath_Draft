package models;

import java.util.ArrayList;

public class MatchResult {
    private Internship internship;
    private double compatibilityScore;
    private boolean eligible;
    private ArrayList<String> eligibilityIssues;
    private ArrayList<String> missingSkills;
    private ArrayList<String> matchedSkills;

    public MatchResult(Internship internship, double compatibilityScore, boolean eligible, ArrayList<String> eligibilityIssues, ArrayList<String> missingSkills, ArrayList<String> matchedSkills){
        this.internship = internship;
        this.compatibilityScore = compatibilityScore;
        this.eligible = eligible;
        this.eligibilityIssues = new ArrayList<>(eligibilityIssues);
        this.missingSkills = new ArrayList<>(missingSkills);
        this.matchedSkills = new ArrayList<>(matchedSkills);
    }

    //Getters
    public Internship getInternship(){
        return internship;
    }

    public double getCompatibilityScore(){
        return compatibilityScore;
    }

    public boolean isEligible(){
        return eligible;
    }

    public ArrayList<String> getMissingSkills(){
        return new ArrayList<>(missingSkills);
    }

    public ArrayList<String> getMatchedSkills(){
        return new ArrayList<>(matchedSkills);
    }

    public ArrayList<String> getEligibilityIssues(){
        return new ArrayList<>(eligibilityIssues);
    }

    //Setters

    public void setInternship(Internship internship){
        this.internship = internship;
    }

    public void setCompatibilityScore(double compatibilityScore){
        this.compatibilityScore = compatibilityScore;
    }

    public void setEligible(boolean eligible){
        this.eligible = eligible;
    }

    public void setMissingSkills(ArrayList<String> missingSkills){
        this.missingSkills = new ArrayList<>(missingSkills);
    }

    public void setMatchedSkills(ArrayList<String> matchedSkills){
        this.matchedSkills = new ArrayList<>(matchedSkills);
    }

    public void setEligibilityIssues(ArrayList<String> eligibilityIssues){
        this.eligibilityIssues = new ArrayList<>(eligibilityIssues);
    }

    //Compatibility score validation
    public boolean isValidCompatibilityScore(){
        return compatibilityScore >= 0.0 && compatibilityScore <= 1.0;
    }
}
