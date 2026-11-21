package com.example.cs_path_draft.services;

import java.util.ArrayList;

import com.example.cs_path_draft.models.Internship;
import com.example.cs_path_draft.models.Student;

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
