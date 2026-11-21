package com.example.cs_path_draft.modes;

import com.example.cs_path_draft.models.Student;
import com.example.cs_path_draft.models.InternshipMatchResult;
import com.example.cs_path_draft.services.InternshipMatcher;

public class DiscoveryMode extends MatchingMode<InternshipMatchResult> {

    @Override
    public InternshipMatchResult execute(Student student){
        InternshipMatchResult result = InternshipMatcher.matchInternships(student);

        return result;
    }
}
