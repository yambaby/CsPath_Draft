package com.example.cs_path_draft.modes;

import com.example.cs_path_draft.models.MatchResult;
import com.example.cs_path_draft.models.Student;
import com.example.cs_path_draft.models.Internship;

import com.example.cs_path_draft.services.InternshipEvaluationService;
public class InternshipMatchingMode extends MatchingMode<MatchResult>{
    private final Internship selectedInternship;

    public InternshipMatchingMode(Internship selectedInternship){
        if (selectedInternship == null){
            throw new  IllegalArgumentException("There is no selected internship");
        }

        this.selectedInternship = selectedInternship;
    }

    @Override
    public MatchResult execute(Student student){
        MatchResult result = InternshipEvaluationService.evaluate(student, selectedInternship);

        return result;
    }


}
