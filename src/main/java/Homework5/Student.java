package Homework5;

public class Student extends Person{

    private double score;

    public Student(String name, int age, boolean isMan, double score) {
        super(name, age, isMan);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if (score < 2 || score > 6 ) {
            throw new IllegalArgumentException();
        }
        this.score = score;
    }

    public void showStudentInfo() {
        super.showPersonInfo();
        System.out.println(getName() + "'s score is: " + getScore());
    }
}
