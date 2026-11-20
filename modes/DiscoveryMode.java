package modes;

import models.Student;
import models.InternshipMatchResult;
import services.InternshipMatcher;

public class DiscoveryMode extends MatchingMode<InternshipMatchResult> {
    
    @Override 
    public InternshipMatchResult execute(Student student){
        InternshipMatchResult result = InternshipMatcher.matchInternships(student);

        return result;
    }
}
