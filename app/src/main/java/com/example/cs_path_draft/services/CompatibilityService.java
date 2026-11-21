package com.example.cs_path_draft.services;

import com.example.cs_path_draft.models.Internship;
import com.example.cs_path_draft.models.Student;

public class CompatibilityService {

    public static double calculateCompatibilityScore(Student student, Internship internship) {

        int totalRequiredSkills = internship.getRequiredSkills().size(); //4
        int totalRelatedInterests = internship.getRelatedInterests().size(); //4
        int matchedSkillsCount = SkillMatchingService.matchedSkills(student, internship).size(); //Student(Java, OOP) SoftwareDev(Java, OOP, Git, Problem Solving) 2
        int matchedInterestsCount = InterestMatchingService.matchInterests(student, internship).size(); //Software Dev   Software dev, 2, 3, 4   1

        if (totalRequiredSkills == 0 || totalRelatedInterests == 0) {
            throw new IllegalArgumentException("Internship requirements cannot be empty.");
        }

        //Formula
        double skillMatchScore = (double) matchedSkillsCount / totalRequiredSkills; // 2 / 4
        double interestMatchScore = (double) matchedInterestsCount / totalRelatedInterests; // 1 / 4

        double result = (skillMatchScore * 0.70) + (interestMatchScore * 0.30);
        return result * 100;
    }
}
