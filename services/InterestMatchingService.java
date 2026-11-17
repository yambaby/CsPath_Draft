package services;

import java.util.ArrayList;

import models.Internship;
import models.Student;

public class InterestMatchingService {
    public static ArrayList<String> matchInterests(Student student, Internship internship){
        ArrayList<String> matchedInterests = new ArrayList<>();
        if (student.getInterests() == null){
            return matchedInterests;
        }
        for (String interest : internship.getRelatedInterests()){
            if (student.getInterests().contains(interest)){
                matchedInterests.add(interest);
            }
        }
        
        return matchedInterests;
    }
}

//"Software Engineering", "Application Development", "Problem Solving", "Software Architecture"
