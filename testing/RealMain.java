package testing;

import java.util.ArrayList;
import java.util.Scanner;

import models.Roadmap;
import services.LearningMapService;

import models.Student;
import models.Internship;
import models.MatchResult;
import models.InternshipMatchResult;

import modes.MatchingMode;
import modes.DiscoveryMode;
import modes.InternshipMatchingMode;

import repositories.InternshipRepository;

public class RealMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {

            System.out.println("\n================================");
            System.out.println("        WELCOME TO CSPath");
            System.out.println("================================");
            System.out.println("[1] Internship Discovery");
            System.out.println("[2] Internship Matching");
            System.out.println("[3] Exit");

            try {

                System.out.print("Select mode: ");
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {

                    case 1:

                        // Future: Manual Input or CV Upload

                        Student discoveryStudent =
                            inputStudentProfile(scanner);

                        MatchingMode<InternshipMatchResult> discoveryMode =
                            new DiscoveryMode();

                        InternshipMatchResult discoveryResult =
                            runMode(discoveryMode, discoveryStudent);

                        displayDiscoveryResult(discoveryResult);

                        // NEW: Learning Map for Discovery Mode
                        selectDiscoveryLearningMap(
                            scanner, discoveryResult
                        );

                        break;

                    case 2:

                        // Future: Manual Input or CV Upload

                        displayAvailableInternships();

                        System.out.print("\nSelect Internship ID: ");
                        int id = Integer.parseInt(scanner.nextLine());

                        Internship selectedInternship =
                            InternshipRepository.getInternshipByID(id);

                        System.out.println("\nSelected Internship: " +
                            selectedInternship.getTitle());

                        Student matchingStudent =
                            inputStudentProfile(scanner);

                        MatchingMode<MatchResult> matchingMode =
                            new InternshipMatchingMode(selectedInternship);

                        MatchResult matchingResult =
                            runMode(matchingMode, matchingStudent);

                        System.out.println("\n=== MATCHING RESULT ===");

                        displayMatchResult(matchingResult);

                        // NEW: Learning Map for Matching Mode

                        System.out.println("\n[1] View Learning Map");
                        System.out.println("[0] Return to Main Menu");

                        System.out.print("Select option: ");
                        int learningMapChoice =
                            Integer.parseInt(scanner.nextLine());

                        if (learningMapChoice == 1) {

                            displayLearningMap(matchingResult);

                        } else if (learningMapChoice != 0) {

                            System.out.println("Invalid option.");
                        }

                        break;

                    case 3:

                        running = false;
                        System.out.println("Thank you for using CSPath!");

                        break;

                    default:

                        System.out.println("Invalid mode selection.");

                }

            } catch (IllegalArgumentException e) {

                System.out.println("Error: " + e.getMessage());

            }
        }

        scanner.close();
    }


    // RUNTIME POLYMORPHISM

    public static <R> R runMode(
            MatchingMode<R> mode, Student student) {

        R result = mode.execute(student);

        return result;
    }


    // STUDENT PROFILE INPUT

    public static Student inputStudentProfile(Scanner scanner) {

        System.out.println("\n=== STUDENT PROFILE ===");

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter year level: ");
        int yearLevel = Integer.parseInt(scanner.nextLine());

        if (yearLevel < 1 || yearLevel > 4) {
            throw new IllegalArgumentException(
                "Year level must be between 1 and 4."
            );
        }

        System.out.print("Enter available months: ");
        int availableMonths =
            Integer.parseInt(scanner.nextLine());

        if (availableMonths <= 0) {
            throw new IllegalArgumentException(
                "Available months must be positive."
            );
        }

        System.out.print("Enter skills (separated by commas): ");

        ArrayList<String> skills =
            parseInput(scanner.nextLine());

        System.out.print("Enter interests (separated by commas): ");

        ArrayList<String> interests =
            parseInput(scanner.nextLine());

        return new Student(
            name,
            skills,
            interests,
            yearLevel,
            availableMonths
        );
    }


    // CONVERT COMMA-SEPARATED INPUT INTO ARRAYLIST

    public static ArrayList<String> parseInput(String input) {

        ArrayList<String> items = new ArrayList<>();

        String[] values = input.split(",");

        for (String value : values) {

            String cleanedValue = value.trim();

            if (!cleanedValue.isEmpty()
                    && !items.contains(cleanedValue)) {

                items.add(cleanedValue);
            }
        }

        return items;
    }


    // DISPLAY AVAILABLE INTERNSHIPS

    public static void displayAvailableInternships() {

        System.out.println("\n=== AVAILABLE INTERNSHIPS ===");

        ArrayList<Internship> internships =
            InternshipRepository.getAllInternships();

        for (Internship internship : internships) {

            System.out.println(
                "[" + internship.getId() + "] "
                + internship.getTitle()
                + " - "
                + internship.getCompany()
            );
        }
    }


    // DISPLAY DISCOVERY MODE RESULTS

    public static void displayDiscoveryResult(
            InternshipMatchResult result) {

        System.out.println("\n=== RECOMMENDED INTERNSHIPS ===");

        if (result.getEligibleInternships().isEmpty()) {

            System.out.println("No eligible recommendations found.");

        } else {

            for (MatchResult match :
                    result.getEligibleInternships()) {

                displayMatchResult(match);
            }
        }

        System.out.println("\n=== INELIGIBLE INTERNSHIPS ===");

        if (result.getIneligibleInternships().isEmpty()) {

            System.out.println("No ineligible recommendations found.");

        } else {

            for (MatchResult match :
                    result.getIneligibleInternships()) {

                displayMatchResult(match);
            }
        }
    }


    // DISPLAY INDIVIDUAL MATCH RESULT

    public static void displayMatchResult(MatchResult result) {

        Internship internship = result.getInternship();

        System.out.println("\n--------------------------------");

        // NEW: Display internship ID

        System.out.println("Internship ID: " +
            internship.getId());

        System.out.println("Internship: " +
            internship.getTitle());

        System.out.println("Company: " +
            internship.getCompany());

        System.out.println("Description: " +
            internship.getDescription());

        System.out.println("Duration: " +
            internship.getDuration() + " months");

        System.out.println("Minimum Year Level: " +
            internship.getMinYearLevel());

        System.out.printf("Compatibility Score: %.2f%%\n",
            result.getCompatibilityScore());

        System.out.println("Eligibility: " +
            (result.isEligible() ? "Eligible" : "Not Eligible"));

        System.out.println("Required Skills: " +
            internship.getRequiredSkills());

        System.out.println("Matched Skills: " +
            result.getMatchedSkills());

        System.out.println("Missing Skills: " +
            result.getMissingSkills());

        if (!result.isEligible()) {

            System.out.println("Eligibility Issues: " +
                result.getEligibilityIssues());
        }

        System.out.println("--------------------------------");
    }


    // ========================================
    // NEW: SELECT LEARNING MAP IN DISCOVERY MODE
    // ========================================

    public static void selectDiscoveryLearningMap(
            Scanner scanner, InternshipMatchResult result) {

        ArrayList<MatchResult> allRecommendations =
            new ArrayList<>();

        allRecommendations.addAll(
            result.getEligibleInternships()
        );

        allRecommendations.addAll(
            result.getIneligibleInternships()
        );

        if (allRecommendations.isEmpty()) {

            System.out.println(
                "\nNo recommended internships to view."
            );

            return;
        }

        while (true) {

            System.out.println("\n=== VIEW LEARNING MAP ===");

            for (MatchResult match : allRecommendations) {

                Internship internship = match.getInternship();

                System.out.printf(
                    "[%d] %s - %.2f%% (%s)\n",
                    internship.getId(),
                    internship.getTitle(),
                    match.getCompatibilityScore(),
                    match.isEligible() ? "Eligible" : "Not Eligible"
                );
            }

            System.out.println("[0] Return to Main Menu");

            System.out.print("\nSelect Internship ID: ");

            int selectedId =
                Integer.parseInt(scanner.nextLine());

            if (selectedId == 0) {
                return;
            }

            MatchResult selectedResult = null;

            for (MatchResult match : allRecommendations) {

                if (match.getInternship().getId() == selectedId) {

                    selectedResult = match;

                    break;
                }
            }

            if (selectedResult != null) {

                displayLearningMap(selectedResult);

            } else {

                System.out.println(
                    "Please select an internship from the recommendations."
                );
            }
        }
    }


    // ========================================
    // NEW: DISPLAY PERSONALIZED LEARNING MAP
    // ========================================

    public static void displayLearningMap(MatchResult matchResult) {

        System.out.println("\n================================");
        System.out.println("    PERSONALIZED LEARNING MAP");
        System.out.println("================================");

        System.out.println("Target Internship: " +
            matchResult.getInternship().getTitle());

        System.out.printf("Compatibility Score: %.2f%%\n",
            matchResult.getCompatibilityScore());

        System.out.println("Matched Skills: " +
            matchResult.getMatchedSkills());

        System.out.println("Missing Skills: " +
            matchResult.getMissingSkills());


        // CAREER ROADMAP

        System.out.println("\n=== CAREER ROADMAP ===");

        Roadmap careerRoadmap =
            LearningMapService.recommendCareerRoadmap(matchResult);

        if (careerRoadmap != null) {

            displayRoadmap(careerRoadmap);

        } else {

            System.out.println("No career roadmap available.");
        }


        // SKILL ROADMAPS

        System.out.println("\n=== RECOMMENDED SKILL ROADMAPS ===");

        ArrayList<Roadmap> skillRoadmaps =
            LearningMapService.recommendSkillRoadmaps(matchResult);

        if (matchResult.getMissingSkills().isEmpty()) {

            System.out.println(
                "Congratulations! You already possess "
                + "all the required technical skills."
            );

        } else if (skillRoadmaps.isEmpty()) {

            System.out.println(
                "No specific roadmaps available for your missing skills."
            );

        } else {

            int number = 1;

            for (Roadmap roadmap : skillRoadmaps) {

                // Prevent repetition of the career roadmap

                if (careerRoadmap != null &&
                    careerRoadmap.getUrl().equals(roadmap.getUrl())) {

                    continue;
                }

                System.out.println("\nRecommendation #" + number);

                displayRoadmap(roadmap);

                number++;
            }

            if (number == 1) {

                System.out.println(
                    "The available skill roadmaps use the same "
                    + "link as your career roadmap above."
                );
            }
        }

        System.out.println("\nLearning resources from roadmap.sh");
        System.out.println("================================");
    }


    // ========================================
    // NEW: DISPLAY INDIVIDUAL ROADMAP
    // ========================================

    public static void displayRoadmap(Roadmap roadmap) {

        System.out.println("Name: " +
            roadmap.getName());

        System.out.println("Description: " +
            roadmap.getDescription());

        System.out.println("URL: " +
            roadmap.getUrl());
    }
}
