package com.example.cs_path_draft.modes;

import com.example.cs_path_draft.models.Student;

public abstract class MatchingMode<R> {
    public abstract R execute(Student student);
}
