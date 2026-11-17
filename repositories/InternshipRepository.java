package repositories;

import java.util.ArrayList;
import java.util.Arrays;

import models.Internship;

public class InternshipRepository {
    private static ArrayList<Internship> internships = new ArrayList<>();

    static {
        internships.add(new Internship(
            1, 
            "Software Development Intern", 
            "Assist in developing and maintaining software applications while collaborating with developers to implement new features and fix bugs.", 
            "TechCorp", 
            6, 
            2, 
            new ArrayList<>(Arrays.asList(
                "Java", "OOP", "Problem Solving", "Git"
            )),
            new ArrayList<>(Arrays.asList(
                "Software Engineering", "Application Development", "Problem Solving", "Software Architecture"
            ))
        ));

        internships.add(new Internship(
            2, 
            "Frontend Developer Intern", 
            "Help create responsive and user-friendly interfaces for web applications using modern frontend technologies.", 
            "PixelWorks", 
            3, 
            2, 
            new ArrayList<>(Arrays.asList(
                "HTML", "CSS", "JavaScript", "React"
            )),
            new ArrayList<>(Arrays.asList(
                "Frontend Development", "Web Design", "User Interface Design", "User Experience"
            ))
        ));

        internships.add(new Internship(
            3, 
            "Backend Developer Intern", 
            "Work on server-side application development, database integration, and REST API implementation.", 
            "CloudNova", 
            6, 
            3, 
            new ArrayList<>(Arrays.asList(
                "Java", "Spring Boot", "SQL", "REST API"
            )),
            new ArrayList<>(Arrays.asList(
                "Backend Development", "API Development", "Server-Side Programming", "System Architecture"
            ))
        ));

        internships.add(new Internship(
            4, 
            "Mobile App Developer Intern", 
            "Assist in building and testing Android applications while learning mobile development practices.", 
            "AppForge", 
            4, 
            2, 
            new ArrayList<>(Arrays.asList(
                "Java", "Android Studio", "XML", "OOP"
            )),
            new ArrayList<>(Arrays.asList(
                "Mobile App Development", "Android Development", "Application Design", "Mobile Technologies"
            ))
        ));

        internships.add(new Internship(
            5, 
            "Data Analyst Intern", 
            "Help collect, organize, and analyze datasets to identify patterns and generate useful business insights.", 
            "DataBridge", 
            3, 
            2, 
            new ArrayList<>(Arrays.asList(
                "Python", "SQL", "Excel", "Data Analysis"
            )),
            new ArrayList<>(Arrays.asList(
                "Data Analytics", "Data Visualization", "Statistical Analysis", "Business Intelligence"
            ))
        ));

        internships.add(new Internship(
            6, 
            "Database Developer Intern", 
            "Assist in designing, maintaining, and optimizing relational databases for business applications.", 
            "DB Solutions", 
            4, 
            3, 
            new ArrayList<>(Arrays.asList(
                "SQL", "MySQL", "Database Design", "Normalization"
            )),
            new ArrayList<>(Arrays.asList(
                "Database Management", "Data Engineering", "Database Architecture", "Data Optimization"
            ))
        ));

        internships.add(new Internship(
            7, 
            "UI/UX Design Intern", 
            "Help design application layouts, create wireframes, and develop prototypes focused on improving user experience.", 
            "CreativeByte", 
            3, 
            2, 
            new ArrayList<>(Arrays.asList(
                "Figma", "Wireframing", "Prototyping", "UI Design"
            )),
            new ArrayList<>(Arrays.asList(
                "UI Design", "UX Research", "User Experience", "Digital Product Design"
            ))
        ));

        internships.add(new Internship(
            8, 
            "Software QA Tester Intern", 
            "Test software applications, identify defects, and document issues to help ensure software quality and reliability.", 
            "QualityTech", 
            3, 
            2, 
            new ArrayList<>(Arrays.asList(
                "Manual Testing", "Test Cases", "Java", "Problem Solving"
            )),
            new ArrayList<>(Arrays.asList(
                "Software Quality Assurance", "Software Testing", "Debugging", "Test Automation"
            ))
        ));

        internships.add(new Internship(
            9, 
            "Machine Learning Intern", 
            "Assist in developing and evaluating machine learning models using datasets to solve practical problems.", 
            "NeuralWorks", 
            6, 
            4, 
            new ArrayList<>(Arrays.asList(
                "Python", "Machine Learning", "Mathematics", "Data Analysis"
            )),
            new ArrayList<>(Arrays.asList(
                "Artificial Intelligence", "Machine Learning", "Deep Learning", "Predictive Analytics"
            ))
        ));

        internships.add(new Internship(
            10, 
            "Cybersecurity Intern", 
            "Help monitor system security, identify potential vulnerabilities, and learn basic cybersecurity practices.", 
            "SecureNet", 
            4, 
            3, 
            new ArrayList<>(Arrays.asList(
                "Networking", "Linux", "Python", "Cybersecurity Fundamentals"
            )),
            new ArrayList<>(Arrays.asList(
                "Cybersecurity", "Ethical Hacking", "Network Security", "Information Security"
            ))
        ));

        internships.add(new Internship(
            11, 
            "Game Developer Intern", 
            "Assist in developing game mechanics, testing gameplay features, and improving interactive experiences.", 
            "PixelPlay Studios", 
            5, 
            2, 
            new ArrayList<>(Arrays.asList(
                "Java", "OOP", "Unity", "C#"
            )),
            new ArrayList<>(Arrays.asList(
                "Game Development", "Game Design", "Interactive Media", "Game Programming"
            ))
        ));

        internships.add(new Internship(
            12, 
            "Cloud Computing Intern", 
            "Help deploy, configure, and maintain cloud-based applications and infrastructure.", 
            "SkyStack Technologies", 
            6, 
            3, 
            new ArrayList<>(Arrays.asList(
                "Linux", "Networking", "AWS", "Docker"
            )),
            new ArrayList<>(Arrays.asList(
                "Cloud Computing", "Cloud Architecture", "DevOps", "Distributed Systems"
            ))
        ));

        internships.add(new Internship(
            13, 
            "AI Development Intern", 
            "Assist in integrating AI technologies into applications and processing data for intelligent system features.", 
            "IntelliTech", 
            6, 
            3, 
            new ArrayList<>(Arrays.asList(
                "Python", "Machine Learning", "APIs", "Data Processing"
            )),
            new ArrayList<>(Arrays.asList(
                "Artificial Intelligence", "Natural Language Processing", "AI Applications", "Intelligent Systems"
            ))
        ));

        internships.add(new Internship(
            14, 
            "Web Developer Intern", 
            "Help build and maintain basic websites while learning web development fundamentals and version control.", 
            "WebCraft", 
            3, 
            1, 
            new ArrayList<>(Arrays.asList(
                "HTML", "CSS", "JavaScript", "Git"
            )),
            new ArrayList<>(Arrays.asList(
                "Web Development", "Full-Stack Development", "Website Design", "Internet Technologies"
            ))
        ));

        internships.add(new Internship(
            15, 
            "IT Support Intern", 
            "Provide technical assistance by troubleshooting computer issues, helping users, and maintaining IT equipment.", 
            "TechAssist", 
            3, 
            1, 
            new ArrayList<>(Arrays.asList(
                "Troubleshooting", "Networking", "Operating Systems", "Communication"
            )),
            new ArrayList<>(Arrays.asList(
                "Technical Support, Computer Systems", "Network Administration", "IT Infrastructure"
            ))
        ));

    }

    public static ArrayList<Internship> getAllInternships(){
        return new ArrayList<>(internships);
    }

    //Test data
    /*public static void main(String[] args) {
        for (Internship internship : internships) {
            System.out.println("CSPath: ID: " + internship.getId());
            System.out.println("CSPath: Title: " + internship.getTitle());
            System.out.println("CSPath: Company: " + internship.getCompany());
            System.out.println("CSPath: Duration: " + internship.getDuration());
            System.out.println("CSPath: Required Skills: " + internship.getRequiredSkills());

            System.out.println("CSPath: ----------------------");
        }
    }  */
}
