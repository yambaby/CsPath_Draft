package services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import models.MatchResult;

import models.Internship;
import models.Student;

public class InternshipRankingService {

    public static ArrayList<MatchResult> rankEligibleInternships(Student student, ArrayList<Internship> internships){
        ArrayList<MatchResult> rankedEligibleInternships = new ArrayList<>();
        ArrayList<MatchResult> topEligibleInternships = new ArrayList<>();

        for (Internship internship : internships) {
            double compatibilityScore = CompatibilityService.calculateCompatibilityScore(student, internship);
            boolean isEligible = EligibilityService.isEligible(student, internship);
            ArrayList<String> eligibilityIssues = EligibilityService.getEligibilityIssue(student, internship);
            ArrayList<String> missingSkills = SkillMatchingService.missingSkills(student, internship);
            ArrayList<String> matchedSkills = SkillMatchingService.matchedSkills(student, internship);

            if (isEligible) {
                MatchResult matchResultEligible = new MatchResult(internship, compatibilityScore, isEligible, eligibilityIssues, missingSkills, matchedSkills);
                rankedEligibleInternships.add(matchResultEligible);
            }
        }

        Collections.sort(
            rankedEligibleInternships,
            Comparator.comparingDouble(MatchResult::getCompatibilityScore).reversed()
        );

        for (int i = 0; i < rankedEligibleInternships.size() && topEligibleInternships.size() < 4; i++){
            if (rankedEligibleInternships.get(i).getCompatibilityScore() != 0.0){
                topEligibleInternships.add(rankedEligibleInternships.get(i));
            }
        }

        return topEligibleInternships;
    }

    public static ArrayList<MatchResult> rankIneligibleInternships(Student student, ArrayList<Internship> internships){
        ArrayList<MatchResult> rankedIneligibleInternships = new ArrayList<>();
        ArrayList<MatchResult> topIneligibleInternships = new ArrayList<>();

        for (Internship internship : internships) {
            double compatibilityScore = CompatibilityService.calculateCompatibilityScore(student, internship);
            boolean isEligible = EligibilityService.isEligible(student, internship);
            ArrayList<String> eligibilityIssues = EligibilityService.getEligibilityIssue(student, internship);
            ArrayList<String> missingSkills = SkillMatchingService.missingSkills(student, internship);
            ArrayList<String> matchedSkills = SkillMatchingService.matchedSkills(student, internship);

            if (!isEligible) {
                MatchResult matchResultIneligible = new MatchResult(internship, compatibilityScore, isEligible, eligibilityIssues, missingSkills, matchedSkills);
                rankedIneligibleInternships.add(matchResultIneligible);
            }
        }

        Collections.sort(
            rankedIneligibleInternships,
            Comparator.comparingDouble(MatchResult::getCompatibilityScore).reversed()
        );

        for (int i = 0; i < rankedIneligibleInternships.size() && topIneligibleInternships.size() < 4; i++){
            if (rankedIneligibleInternships.get(i).getCompatibilityScore() != 0.0){
                topIneligibleInternships.add(rankedIneligibleInternships.get(i));
            }
        }

        return topIneligibleInternships;
    }
}
