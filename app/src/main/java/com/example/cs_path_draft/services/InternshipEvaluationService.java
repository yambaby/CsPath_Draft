package com.example.cs_path_draft.services;

import java.util.ArrayList;

import com.example.cs_path_draft.models.Internship;
import com.example.cs_path_draft.models.MatchResult;
import com.example.cs_path_draft.models.Student;

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
