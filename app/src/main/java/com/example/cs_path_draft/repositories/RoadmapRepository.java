package com.example.cs_path_draft.repositories;

import java.util.ArrayList;
import java.util.HashMap;

import com.example.cs_path_draft.models.Internship;
import com.example.cs_path_draft.models.Roadmap;

public class RoadmapRepository {

    private static final HashMap<Integer, Roadmap> careerRoadmaps =
            new HashMap<>();

    private static final HashMap<String, Roadmap> skillRoadmaps =
            new HashMap<>();

    static {

        // ========================================
        // CAREER ROADMAPS
        // ========================================

        // 1. Software Development Intern
        careerRoadmaps.put(1, new Roadmap(
                "Computer Science Roadmap",
                "https://roadmap.sh/computer-science",
                "Learn programming fundamentals, algorithms, data structures, and software development concepts."
        ));

        // 2. Frontend Developer Intern
        careerRoadmaps.put(2, new Roadmap(
                "Frontend Developer Roadmap",
                "https://roadmap.sh/frontend",
                "Learn HTML, CSS, JavaScript, and modern frontend development."
        ));

        // 3. Backend Developer Intern
        careerRoadmaps.put(3, new Roadmap(
                "Backend Developer Roadmap",
                "https://roadmap.sh/backend",
                "Learn server-side programming, databases, APIs, and backend architecture."
        ));

        // 4. Mobile App Developer Intern
        careerRoadmaps.put(4, new Roadmap(
                "Android Developer Roadmap",
                "https://roadmap.sh/android",
                "Learn Android application development and mobile application architecture."
        ));

        // 5. Data Analyst Intern
        careerRoadmaps.put(5, new Roadmap(
                "Data Analyst Roadmap",
                "https://roadmap.sh/data-analyst",
                "Learn data cleaning, analysis, visualization, statistics, and reporting."
        ));

        // 6. Database Developer Intern
        careerRoadmaps.put(6, new Roadmap(
                "SQL Roadmap",
                "https://roadmap.sh/sql",
                "Learn relational databases, SQL queries, database design, and optimization."
        ));

        // 7. UI/UX Design Intern
        careerRoadmaps.put(7, new Roadmap(
                "UX Design Roadmap",
                "https://roadmap.sh/ux-design",
                "Learn user research, interface design, prototyping, and usability principles."
        ));

        // 8. Software QA Tester Intern
        careerRoadmaps.put(8, new Roadmap(
                "QA Engineer Roadmap",
                "https://roadmap.sh/qa",
                "Learn software testing, quality assurance, test automation, and defect reporting."
        ));

        // 9. Machine Learning Intern
        careerRoadmaps.put(9, new Roadmap(
                "Machine Learning Roadmap",
                "https://roadmap.sh/machine-learning",
                "Learn machine learning algorithms, mathematics, data preparation, and model evaluation."
        ));

        // 10. Cybersecurity Intern
        careerRoadmaps.put(10, new Roadmap(
                "Cyber Security Roadmap",
                "https://roadmap.sh/cyber-security",
                "Learn security fundamentals, network security, vulnerabilities, and defensive practices."
        ));

        // 11. Game Developer Intern
        careerRoadmaps.put(11, new Roadmap(
                "Game Developer Roadmap",
                "https://roadmap.sh/game-developer",
                "Learn game programming, game engines, game mechanics, and development techniques."
        ));

        // 12. Cloud Computing Intern
        careerRoadmaps.put(12, new Roadmap(
                "Cloud Computing Roadmap",
                "https://roadmap.sh/cloud-computing",
                "Learn cloud infrastructure, virtualization, cloud services, and deployment."
        ));

        // 13. AI Development Intern
        careerRoadmaps.put(13, new Roadmap(
                "AI Engineer Roadmap",
                "https://roadmap.sh/ai-engineer",
                "Learn artificial intelligence tools, AI models, and practical AI application development."
        ));

        // 14. Web Developer Intern
        careerRoadmaps.put(14, new Roadmap(
                "Full Stack Developer Roadmap",
                "https://roadmap.sh/full-stack",
                "Learn frontend, backend, databases, and complete web application development."
        ));

        // 15. IT Support Intern
        careerRoadmaps.put(15, new Roadmap(
                "Computer Science Roadmap",
                "https://roadmap.sh/computer-science",
                "Build foundational knowledge of computer systems, operating systems, and computing."
        ));


        // ========================================
        // SKILL ROADMAPS
        // ========================================


        // PROGRAMMING LANGUAGES

        skillRoadmaps.put("Java", new Roadmap(
                "Java Roadmap",
                "https://roadmap.sh/java",
                "Learn Java fundamentals and object-oriented programming."
        ));

        skillRoadmaps.put("Python", new Roadmap(
                "Python Roadmap",
                "https://roadmap.sh/python",
                "Learn Python programming and its applications."
        ));

        skillRoadmaps.put("C++", new Roadmap(
                "C++ Roadmap",
                "https://roadmap.sh/cpp",
                "Learn C++ programming, memory management, and object-oriented concepts."
        ));

        skillRoadmaps.put("C", new Roadmap(
                "C Programming Roadmap",
                "https://roadmap.sh/c",
                "Learn procedural programming and memory management."
        ));

        skillRoadmaps.put("C#", new Roadmap(
                "ASP.NET Core Roadmap",
                "https://roadmap.sh/aspnet-core",
                "Explore C# and .NET application development."
        ));

        skillRoadmaps.put("JavaScript", new Roadmap(
                "JavaScript Roadmap",
                "https://roadmap.sh/javascript",
                "Learn JavaScript fundamentals and web programming."
        ));

        skillRoadmaps.put("TypeScript", new Roadmap(
                "TypeScript Roadmap",
                "https://roadmap.sh/typescript",
                "Learn statically typed JavaScript development."
        ));

        skillRoadmaps.put("Kotlin", new Roadmap(
                "Kotlin Roadmap",
                "https://roadmap.sh/kotlin",
                "Learn Kotlin programming for modern application development."
        ));

        skillRoadmaps.put("PHP", new Roadmap(
                "PHP Roadmap",
                "https://roadmap.sh/php",
                "Learn server-side web development using PHP."
        ));

        skillRoadmaps.put("R", new Roadmap(
                "R Programming Roadmap",
                "https://roadmap.sh/r",
                "Learn statistical programming and data analysis."
        ));


        // SOFTWARE DEVELOPMENT FUNDAMENTALS

        skillRoadmaps.put("OOP", new Roadmap(
                "Object-Oriented Programming",
                "https://roadmap.sh/computer-science",
                "Explore object-oriented programming and software development fundamentals."
        ));

        skillRoadmaps.put("Data Structures", new Roadmap(
                "Data Structures and Algorithms Roadmap",
                "https://roadmap.sh/datastructures-and-algorithms",
                "Learn arrays, linked lists, stacks, queues, trees, and graphs."
        ));

        skillRoadmaps.put("Algorithms", new Roadmap(
                "Data Structures and Algorithms Roadmap",
                "https://roadmap.sh/datastructures-and-algorithms",
                "Learn searching, sorting, recursion, and algorithm analysis."
        ));

        skillRoadmaps.put("Git", new Roadmap(
                "Git and GitHub Roadmap",
                "https://roadmap.sh/git-github",
                "Learn version control and collaborative software development."
        ));

        skillRoadmaps.put("Debugging", new Roadmap(
                "Computer Science Roadmap",
                "https://roadmap.sh/computer-science",
                "Strengthen programming and problem-solving fundamentals."
        ));


        // FRONTEND DEVELOPMENT

        skillRoadmaps.put("HTML", new Roadmap(
                "HTML Roadmap",
                "https://roadmap.sh/html",
                "Learn webpage structure and semantic HTML."
        ));

        skillRoadmaps.put("CSS", new Roadmap(
                "CSS Roadmap",
                "https://roadmap.sh/css",
                "Learn styling, responsive design, and webpage layouts."
        ));

        skillRoadmaps.put("React", new Roadmap(
                "React Roadmap",
                "https://roadmap.sh/react",
                "Learn component-based frontend application development."
        ));

        skillRoadmaps.put("Angular", new Roadmap(
                "Angular Roadmap",
                "https://roadmap.sh/angular",
                "Learn frontend application development using Angular."
        ));

        skillRoadmaps.put("Responsive Design", new Roadmap(
                "Frontend Developer Roadmap",
                "https://roadmap.sh/frontend",
                "Learn responsive layouts and mobile-friendly web design."
        ));


        // BACKEND DEVELOPMENT

        skillRoadmaps.put("Spring Boot", new Roadmap(
                "Spring Boot Roadmap",
                "https://roadmap.sh/spring-boot",
                "Learn Java backend development using Spring Boot."
        ));

        skillRoadmaps.put("REST API", new Roadmap(
                "API Design Roadmap",
                "https://roadmap.sh/api-design",
                "Learn REST APIs, HTTP methods, endpoints, and API design."
        ));

        skillRoadmaps.put("Node.js", new Roadmap(
                "Node.js Roadmap",
                "https://roadmap.sh/nodejs",
                "Learn JavaScript-based server-side development."
        ));

        skillRoadmaps.put("Django", new Roadmap(
                "Django Roadmap",
                "https://roadmap.sh/django",
                "Learn Python-based backend web development."
        ));


        // MOBILE APPLICATION DEVELOPMENT

        skillRoadmaps.put("Android Studio", new Roadmap(
                "Android Developer Roadmap",
                "https://roadmap.sh/android",
                "Learn Android application development and its tools."
        ));

        skillRoadmaps.put("XML", new Roadmap(
                "Android Developer Roadmap",
                "https://roadmap.sh/android",
                "Explore Android interfaces, resources, and application development."
        ));

        skillRoadmaps.put("Flutter", new Roadmap(
                "Flutter Roadmap",
                "https://roadmap.sh/flutter",
                "Learn cross-platform mobile application development."
        ));

        skillRoadmaps.put("React Native", new Roadmap(
                "React Native Roadmap",
                "https://roadmap.sh/react-native",
                "Learn mobile application development using React Native."
        ));


        // DATA ANALYSIS

        skillRoadmaps.put("Excel", new Roadmap(
                "Data Analyst Roadmap",
                "https://roadmap.sh/data-analyst",
                "Explore spreadsheet-based data analysis and reporting."
        ));

        skillRoadmaps.put("Statistics", new Roadmap(
                "Data Analyst Roadmap",
                "https://roadmap.sh/data-analyst",
                "Learn statistical concepts used in data analysis."
        ));

        skillRoadmaps.put("Data Visualization", new Roadmap(
                "Data Analyst Roadmap",
                "https://roadmap.sh/data-analyst",
                "Learn to communicate insights through charts and dashboards."
        ));

        skillRoadmaps.put("Power BI", new Roadmap(
                "Power BI Roadmap",
                "https://roadmap.sh/power-bi",
                "Learn business intelligence and interactive dashboards."
        ));

        skillRoadmaps.put("Tableau", new Roadmap(
                "Data Analyst Roadmap",
                "https://roadmap.sh/data-analyst",
                "Explore data visualization and business intelligence concepts."
        ));

        skillRoadmaps.put("Pandas", new Roadmap(
                "Python for Data Analysis Roadmap",
                "https://roadmap.sh/python-data-analysis",
                "Learn data manipulation and analysis using Python."
        ));

        skillRoadmaps.put("NumPy", new Roadmap(
                "Python for Data Analysis Roadmap",
                "https://roadmap.sh/python-data-analysis",
                "Learn numerical computing and multidimensional arrays."
        ));


        // DATABASE DEVELOPMENT

        skillRoadmaps.put("SQL", new Roadmap(
                "SQL Roadmap",
                "https://roadmap.sh/sql",
                "Learn database queries, joins, and data manipulation."
        ));

        skillRoadmaps.put("MySQL", new Roadmap(
                "SQL Roadmap",
                "https://roadmap.sh/sql",
                "Learn relational database and SQL fundamentals."
        ));

        skillRoadmaps.put("Database Design", new Roadmap(
                "SQL Roadmap",
                "https://roadmap.sh/sql",
                "Learn database structures, relationships, and normalization."
        ));

        skillRoadmaps.put("Database Management", new Roadmap(
                "PostgreSQL Roadmap",
                "https://roadmap.sh/postgresql-dba",
                "Explore database administration and management concepts."
        ));

        skillRoadmaps.put("PostgreSQL", new Roadmap(
                "PostgreSQL Roadmap",
                "https://roadmap.sh/postgresql-dba",
                "Learn PostgreSQL database administration."
        ));

        skillRoadmaps.put("MongoDB", new Roadmap(
                "MongoDB Roadmap",
                "https://roadmap.sh/mongodb",
                "Learn document-oriented NoSQL databases."
        ));


        // UI/UX DESIGN

        skillRoadmaps.put("Figma", new Roadmap(
                "UX Design Roadmap",
                "https://roadmap.sh/ux-design",
                "Explore interface design and prototyping concepts used with design tools."
        ));

        skillRoadmaps.put("UI/UX Design", new Roadmap(
                "UX Design Roadmap",
                "https://roadmap.sh/ux-design",
                "Learn user-centered interface and experience design."
        ));

        skillRoadmaps.put("Wireframing", new Roadmap(
                "UX Design Roadmap",
                "https://roadmap.sh/ux-design",
                "Explore interface planning and wireframing."
        ));

        skillRoadmaps.put("Prototyping", new Roadmap(
                "UX Design Roadmap",
                "https://roadmap.sh/ux-design",
                "Learn prototyping and user interaction design."
        ));

        skillRoadmaps.put("User Research", new Roadmap(
                "UX Design Roadmap",
                "https://roadmap.sh/ux-design",
                "Learn user research and usability evaluation."
        ));


        // SOFTWARE QUALITY ASSURANCE

        skillRoadmaps.put("Software Testing", new Roadmap(
                "QA Engineer Roadmap",
                "https://roadmap.sh/qa",
                "Learn software testing techniques and quality assurance."
        ));

        skillRoadmaps.put("Manual Testing", new Roadmap(
                "QA Engineer Roadmap",
                "https://roadmap.sh/qa",
                "Learn manual testing methods and test execution."
        ));

        skillRoadmaps.put("Automation Testing", new Roadmap(
                "QA Engineer Roadmap",
                "https://roadmap.sh/qa",
                "Learn automated testing approaches and tools."
        ));

        skillRoadmaps.put("Test Case Design", new Roadmap(
                "QA Engineer Roadmap",
                "https://roadmap.sh/qa",
                "Learn how to design effective software test cases."
        ));

        skillRoadmaps.put("Bug Reporting", new Roadmap(
                "QA Engineer Roadmap",
                "https://roadmap.sh/qa",
                "Learn defect identification and reporting."
        ));

        skillRoadmaps.put("Selenium", new Roadmap(
                "QA Engineer Roadmap",
                "https://roadmap.sh/qa",
                "Explore browser automation and software testing."
        ));


        // MACHINE LEARNING AND AI

        skillRoadmaps.put("Machine Learning", new Roadmap(
                "Machine Learning Roadmap",
                "https://roadmap.sh/machine-learning",
                "Learn machine learning algorithms and model development."
        ));

        skillRoadmaps.put("Deep Learning", new Roadmap(
                "Machine Learning Roadmap",
                "https://roadmap.sh/machine-learning",
                "Explore neural networks and deep learning concepts."
        ));

        skillRoadmaps.put("TensorFlow", new Roadmap(
                "Machine Learning Roadmap",
                "https://roadmap.sh/machine-learning",
                "Explore machine learning frameworks and model training."
        ));

        skillRoadmaps.put("Scikit-learn", new Roadmap(
                "Machine Learning Roadmap",
                "https://roadmap.sh/machine-learning",
                "Learn machine learning workflows and model evaluation."
        ));

        skillRoadmaps.put("Artificial Intelligence", new Roadmap(
                "AI Engineer Roadmap",
                "https://roadmap.sh/ai-engineer",
                "Learn AI concepts and practical AI application development."
        ));

        skillRoadmaps.put("NLP", new Roadmap(
                "AI Engineer Roadmap",
                "https://roadmap.sh/ai-engineer",
                "Explore language models and natural language applications."
        ));

        skillRoadmaps.put("Linear Algebra", new Roadmap(
                "Machine Learning Roadmap",
                "https://roadmap.sh/machine-learning",
                "Explore mathematical foundations of machine learning."
        ));


        // CYBERSECURITY AND NETWORKING

        skillRoadmaps.put("Networking", new Roadmap(
                "Network Engineer Roadmap",
                "https://roadmap.sh/network-engineer",
                "Learn computer networks, communication protocols, and network infrastructure."
        ));

        skillRoadmaps.put("Network Security", new Roadmap(
                "Cyber Security Roadmap",
                "https://roadmap.sh/cyber-security",
                "Learn network protection and security fundamentals."
        ));

        skillRoadmaps.put("Cybersecurity", new Roadmap(
                "Cyber Security Roadmap",
                "https://roadmap.sh/cyber-security",
                "Learn cybersecurity principles and defensive techniques."
        ));

        skillRoadmaps.put("Ethical Hacking", new Roadmap(
                "Cyber Security Roadmap",
                "https://roadmap.sh/cyber-security",
                "Explore authorized security testing fundamentals."
        ));

        skillRoadmaps.put("Linux", new Roadmap(
                "Linux Roadmap",
                "https://roadmap.sh/linux",
                "Learn Linux operating systems and command-line tools."
        ));


        // GAME DEVELOPMENT

        skillRoadmaps.put("Unity", new Roadmap(
                "Game Developer Roadmap",
                "https://roadmap.sh/game-developer",
                "Explore game engines and game development fundamentals."
        ));

        skillRoadmaps.put("Unreal Engine", new Roadmap(
                "Game Developer Roadmap",
                "https://roadmap.sh/game-developer",
                "Explore game engines and game programming concepts."
        ));

        skillRoadmaps.put("Game Design", new Roadmap(
                "Game Developer Roadmap",
                "https://roadmap.sh/game-developer",
                "Learn game mechanics and game development principles."
        ));

        skillRoadmaps.put("Game Development", new Roadmap(
                "Game Developer Roadmap",
                "https://roadmap.sh/game-developer",
                "Learn the foundations of game development."
        ));


        // CLOUD COMPUTING

        skillRoadmaps.put("Cloud Computing", new Roadmap(
                "Cloud Computing Roadmap",
                "https://roadmap.sh/cloud-computing",
                "Learn cloud infrastructure and services."
        ));

        skillRoadmaps.put("AWS", new Roadmap(
                "AWS Roadmap",
                "https://roadmap.sh/aws",
                "Learn Amazon Web Services and cloud infrastructure."
        ));

        skillRoadmaps.put("Docker", new Roadmap(
                "Docker Roadmap",
                "https://roadmap.sh/docker",
                "Learn containerization and application deployment."
        ));

        skillRoadmaps.put("Kubernetes", new Roadmap(
                "Kubernetes Roadmap",
                "https://roadmap.sh/kubernetes",
                "Learn container orchestration."
        ));

        skillRoadmaps.put("Virtualization", new Roadmap(
                "Cloud Computing Roadmap",
                "https://roadmap.sh/cloud-computing",
                "Explore virtualization and cloud infrastructure fundamentals."
        ));

        skillRoadmaps.put("DevOps", new Roadmap(
                "DevOps Roadmap",
                "https://roadmap.sh/devops",
                "Learn deployment, automation, and infrastructure management."
        ));


        // IT SUPPORT

        skillRoadmaps.put("Troubleshooting", new Roadmap(
                "Computer Science Roadmap",
                "https://roadmap.sh/computer-science",
                "Strengthen foundational computing knowledge for troubleshooting."
        ));

        skillRoadmaps.put("Computer Hardware", new Roadmap(
                "Computer Science Roadmap",
                "https://roadmap.sh/computer-science",
                "Explore computer architecture and computing fundamentals."
        ));

        skillRoadmaps.put("Operating Systems", new Roadmap(
                "Computer Science Roadmap",
                "https://roadmap.sh/computer-science",
                "Learn operating system concepts and computer resources."
        ));

        skillRoadmaps.put("Technical Support", new Roadmap(
                "Computer Science Roadmap",
                "https://roadmap.sh/computer-science",
                "Build foundational computing knowledge relevant to technical support."
        ));

        skillRoadmaps.put("Problem Solving", new Roadmap(
                "Data Structures and Algorithms Roadmap",
                "https://roadmap.sh/datastructures-and-algorithms",
                "Develop logical thinking and programming problem-solving skills."
        ));

        skillRoadmaps.put("Data Analysis", new Roadmap(
                "Data Analyst Roadmap",
                "https://roadmap.sh/data-analyst",
                "Learn data exploration, analysis, and interpretation."
        ));

        skillRoadmaps.put("Normalization", new Roadmap(
                "SQL Roadmap",
                "https://roadmap.sh/sql",
                "Learn relational database design and normalization."
        ));

        skillRoadmaps.put("UI Design", new Roadmap(
                "UX Design Roadmap",
                "https://roadmap.sh/ux-design",
                "Learn interface design and usability principles."
        ));

        skillRoadmaps.put("Test Cases", new Roadmap(
                "QA Engineer Roadmap",
                "https://roadmap.sh/qa",
                "Learn test case preparation and software testing."
        ));

        skillRoadmaps.put("Mathematics", new Roadmap(
                "Machine Learning Roadmap",
                "https://roadmap.sh/machine-learning",
                "Explore mathematical foundations for machine learning."
        ));

        skillRoadmaps.put("Cybersecurity Fundamentals", new Roadmap(
                "Cyber Security Roadmap",
                "https://roadmap.sh/cyber-security",
                "Learn fundamental cybersecurity principles."
        ));

        skillRoadmaps.put("APIs", new Roadmap(
                "API Design Roadmap",
                "https://roadmap.sh/api-design",
                "Learn API design, communication, and integration."
        ));

        skillRoadmaps.put("Data Processing", new Roadmap(
                "Data Analyst Roadmap",
                "https://roadmap.sh/data-analyst",
                "Learn data preparation, transformation, and processing."
        ));

        skillRoadmaps.put("Communication", new Roadmap(
                "Engineering Manager Roadmap",
                "https://roadmap.sh/engineering-manager",
                "Explore professional communication and interpersonal skills."
        ));

    }

    // Retrieval methods

    public static Roadmap getCareerRoadmap(int internshipId) {
        return careerRoadmaps.get(internshipId);
    }

    public static Roadmap getSkillRoadMap(String skill) {
        return skillRoadmaps.get(skill);
    }


}
