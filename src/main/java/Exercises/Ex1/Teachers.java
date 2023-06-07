package Exercises.Ex1;

import java.util.ArrayList;

public class Teachers extends People {
    private String teacherName;
    private ArrayList<Subject> subjects;
    public Teachers(String teacherName, ArrayList<Subject> subjects) {
        super();
        this.subjects = subjects;
        this.teacherName = teacherName;
    }

}
