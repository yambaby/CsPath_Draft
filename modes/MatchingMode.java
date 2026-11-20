package modes;

import models.Student;

public abstract class MatchingMode<R> {
    public abstract R execute(Student student);
}
