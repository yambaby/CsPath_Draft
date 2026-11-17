package testing;

import java.util.ArrayList;
import models.Student;
import services.InternshipMatcher;
import models.InternshipMatchResult;
import models.MatchResult;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> skills = new ArrayList<>();
        ArrayList<String> interests = new ArrayList<>();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter skills: ");
        String skillsInput = scanner.nextLine();
        for (String skill : skillsInput.split(",")) {
            skills.add(skill.trim());
        }

        System.out.print("Enter interests: ");
        String interestsInput = scanner.nextLine();
        for (String interest : interestsInput.split(",")) {
            interests.add(interest.trim());
        }

        System.out.print("Enter year level: ");
        int yearLevel = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter preferred amount of months available: ");
        int availabilityInput = scanner.nextInt();
        scanner.nextLine();

        Student student = new Student(name, skills, interests, yearLevel, availabilityInput);

        InternshipMatchResult result = InternshipMatcher.matchInternships(student);

        System.out.println("Student created: " + student.getName());
        System.out.println("Skills: " + student.getSkills());
        System.out.println("Interests: " + student.getInterests());
        System.out.println("Year Level: " + student.getYearLevel());
        System.out.println("Available Months: " + student.getAvailableMonths());

        System.out.println("-------Internship Matching Results-------");
        System.out.println();
        System.out.println("-----Eligible Internships-----");
        System.out.println();
        ArrayList<MatchResult> eligibleInternships = result.getEligibleInternships();
        for (MatchResult internship : eligibleInternships) {
            System.out.println("Internship: " + internship.getInternship().getTitle());
            System.out.println("Company: " + internship.getInternship().getCompany());
            System.out.println("Compatibility Score: " + internship.getCompatibilityScore());
            System.out.println("Matched Skills: " + internship.getMatchedSkills());
            System.out.println("Missing Skills: " + internship.getMissingSkills());
            System.out.println("----------------------------------------");
            System.out.println();
        }

        ArrayList<MatchResult> ineligibleInternships = result.getIneligibleInternships();
        System.out.println("-----Ineligible Internships-----");
        if (ineligibleInternships.isEmpty()) {
            System.out.println("No ineligible internships found.");
        }
        for (MatchResult internship : ineligibleInternships) {
            System.out.println("Internship: " + internship.getInternship().getTitle());
            System.out.println("Company: " + internship.getInternship().getCompany());
            System.out.println("Compatibility Score: " + internship.getCompatibilityScore());
            System.out.println("Matched Skills: " + internship.getMatchedSkills());
            System.out.println("Missing Skills: " + internship.getMissingSkills());
            System.out.println("Eligibility Issues: " + internship.getEligibilityIssues());
            System.out.println("----------------------------------------");
            System.out.println();
        }
    }
}
