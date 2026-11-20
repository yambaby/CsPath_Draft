package services;

import java.util.ArrayList;

import models.Internship;
import models.MatchResult;
import models.Student;

public class InternshipEvaluationService {
    public static MatchResult evaluate(Student student, Internship internship) {

        double compatibilityScore = CompatibilityService.calculateCompatibilityScore(student, internship);
        boolean isEligible = EligibilityService.isEligible(student, internship);
        ArrayList<String> eligibilityIssues = EligibilityService.getEligibilityIssue(student, internship);
        ArrayList<String> missingSkills = SkillMatchingService.missingSkills(student, internship);
        ArrayList<String> matchedSkills = SkillMatchingService.matchedSkills(student, internship);

        return new MatchResult(internship, compatibilityScore, isEligible, eligibilityIssues, missingSkills, matchedSkills);
    }
}
