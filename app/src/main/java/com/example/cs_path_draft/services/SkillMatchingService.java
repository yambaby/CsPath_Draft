package com.example.cs_path_draft.services;

import java.util.ArrayList;

import com.example.cs_path_draft.models.Internship;
import com.example.cs_path_draft.models.Student;

public class SkillMatchingService {

    public static ArrayList<String> matchedSkills(Student student, Internship internship) {
        ArrayList<String> matchedSkills = new ArrayList<>();
        if (student.getSkills() == null){
            return matchedSkills;
        }

        for (String requiredSkill : internship.getRequiredSkills()) {
            if (student.getSkills().contains(requiredSkill)) {
                matchedSkills.add(requiredSkill);
            }
        }
        return matchedSkills;
    }

    public static ArrayList<String> missingSkills(Student student, Internship internship) {
        ArrayList<String> missingSkills = new ArrayList<>();
        if (student.getSkills() == null){
            for (String requiredSkill : internship.getRequiredSkills()) {
                missingSkills.add(requiredSkill);
            }
            return missingSkills;
        }
        for (String requiredSkill : internship.getRequiredSkills()) {
            if (!student.getSkills().contains(requiredSkill)) {
                missingSkills.add(requiredSkill);
            }
        }
        return missingSkills;
    }
}
