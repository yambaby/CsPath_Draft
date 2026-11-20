package testing;

import models.Internship;
import repositories.InternshipRepository;

public class InternshipIDMatching {
    public static void main(String[] args) {
        Internship selectedInternship =
    InternshipRepository.getInternshipByID(3);

    System.out.println(selectedInternship.getTitle());
    System.out.println(selectedInternship.getCompany());
    System.out.println(selectedInternship.getRequiredSkills());
    }

}
