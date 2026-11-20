package modes;

import models.MatchResult;
import models.Student;
import models.Internship;

import services.InternshipEvaluationService;
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
