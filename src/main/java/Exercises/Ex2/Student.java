package Exercises.Ex2;

public class Student extends Human {
    private int studentGrade;
    public Student(int studentGrade, String name, String familyName) {
        super(name, familyName);
        this.studentGrade = studentGrade;
    }
}
