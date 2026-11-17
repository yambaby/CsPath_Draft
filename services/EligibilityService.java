package services;

import java.util.ArrayList;

import models.Internship;
import models.Student;

public class EligibilityService {
    
    public static boolean isEligible(Student student, Internship internship) {
        if (student.getYearLevel() < internship.getMinYearLevel() || student.getAvailableMonths() < internship.getDuration()) {
            return false;
        }
        return true;
    }

    public static ArrayList<String> getEligibilityIssue(Student student, Internship internship) {
        ArrayList<String> issues = new ArrayList<>();
        if (student.getYearLevel() < internship.getMinYearLevel()) {
            issues.add("Student's year level is below the minimum required for this internship.");
        }
        if (student.getAvailableMonths() < internship.getDuration()) {
            issues.add("Student does not have enough available months to complete this internship.");
        }

        return issues;
    }

    //testing
    /*
    public static void main(String[] args) {
        // Example usage
        ArrayList<String> requiredSkills = new ArrayList<>();
        requiredSkills.add("Java");
        requiredSkills.add("Python");

        ArrayList<String> studentSkills = new ArrayList<>();
        studentSkills.add("Java");

        ArrayList<String> studentInterests = new ArrayList<>();
        studentInterests.add("Software Development");


        Internship internship = new Internship(1, "Software Development Intern", "Work on software projects.", "Tech Company", 3, 2, requiredSkills);
        Student student = new Student("Liam", studentSkills, studentInterests, 1, 2);

        boolean eligible = isEligible(student, internship);
        ArrayList<String> issues = getEligibilityIssue(student, internship);

        System.out.println("Is the student eligible? " + eligible);
        System.out.println("Eligibility issues: " + issues);
    }
    */
}
