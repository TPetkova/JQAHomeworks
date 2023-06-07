package Exercises.Ex1;

import java.util.ArrayList;

public class SchoolClass extends School {
    private char classId;
    private ArrayList<Teachers> teachers;

    public SchoolClass(char classId, ArrayList<Teachers> teachers) {
        super();
        this.classId = classId;
        this.teachers = teachers;
    }
    public void AddTeacher(Teachers teachers) {
        this.teachers.add(teachers);
    }

    public void main(String[] args) {
        SchoolClass s = new SchoolClass('A',teachers);
        Subject subjectMath = new Subject("Math", 4,2);
        Subject subjectEn = new Subject("En", 3, 1);
        ArrayList<Subject> subjects = new ArrayList<>();
        subjects.add(subjectEn);
        subjects.add(subjectMath);
        Teachers galya = new Teachers("Galya", subjects);
        s.AddTeacher(galya);

    }
}
