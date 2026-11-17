package services;
import models.Internship;
import models.Student;
import models.MatchResult;
import models.InternshipMatchResult;

import java.util.ArrayList;

import repositories.InternshipRepository;

public class InternshipMatcher {

    public static InternshipMatchResult matchInternships(Student student){
        ArrayList<Internship> internships = InternshipRepository.getAllInternships();
        ArrayList<MatchResult> eligibleInternships = InternshipRankingService.rankEligibleInternships(student, internships);
        ArrayList<MatchResult> ineligibleInternships = InternshipRankingService.rankIneligibleInternships(student, internships);

        return new InternshipMatchResult(eligibleInternships, ineligibleInternships);
        
    }
}
