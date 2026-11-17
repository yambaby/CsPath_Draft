package models;

import java.util.ArrayList;

public class InternshipMatchResult {
    private ArrayList<MatchResult> eligibleInternships;
    private ArrayList<MatchResult> ineligibleInternships;

    public InternshipMatchResult(ArrayList<MatchResult> eligibleInternships, ArrayList<MatchResult> ineligibleInternships){
        this.eligibleInternships = new ArrayList<>(eligibleInternships);
        this.ineligibleInternships = new ArrayList<>(ineligibleInternships);
    }

    //Getters
    public ArrayList<MatchResult> getEligibleInternships(){
        return new ArrayList<>(eligibleInternships);
    }

    public ArrayList<MatchResult> getIneligibleInternships(){
        return new ArrayList<>(ineligibleInternships);
    }

}
