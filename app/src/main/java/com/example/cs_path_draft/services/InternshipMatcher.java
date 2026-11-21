package com.example.cs_path_draft.services;

import com.example.cs_path_draft.models.Internship;
import com.example.cs_path_draft.models.Student;
import com.example.cs_path_draft.models.MatchResult;
import com.example.cs_path_draft.models.InternshipMatchResult;

import java.util.ArrayList;

import com.example.cs_path_draft.repositories.InternshipRepository;

public class InternshipMatcher {

    public static InternshipMatchResult matchInternships(Student student){
        ArrayList<Internship> internships = InternshipRepository.getAllInternships();
        ArrayList<MatchResult> eligibleInternships = InternshipRankingService.rankEligibleInternships(student, internships);
        ArrayList<MatchResult> ineligibleInternships = InternshipRankingService.rankIneligibleInternships(student, internships);

        return new InternshipMatchResult(eligibleInternships, ineligibleInternships);

    }
}
