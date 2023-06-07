package Exercises.Ex3;


import Exercises.Ex2.Student;

import java.util.Arrays;

public class Students implements Comparable<Students> {
    private String studentName;
    private double studentGrade;

    public Students(String studentName, double studentGrade) {
        this.studentGrade = studentGrade;
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(double studentGrade) {
        this.studentGrade = studentGrade;
    }


    @Override
    public int compareTo(Students students) {
        if (this.studentGrade < students.studentGrade) {
            return -1;
        } else if (this.studentGrade > students.studentGrade) {
            return 1;
        } else {
            return 0;
        }
    }


    public static void main(String[] args) {
        Students studentArray[] = new Students[10];
        studentArray[0] = new Students("Petar", 4.50);
        studentArray[1] = new Students("Georgi", 4.25);
        studentArray[2] = new Students("Poli", 5.50);
        studentArray[3] = new Students("Petya", 5.70);
        studentArray[4] = new Students("Ivan", 4.90);
        studentArray[5] = new Students("Plami", 5.90);
        studentArray[6] = new Students("Emo", 6.00);
        studentArray[7] = new Students("Penka", 4.00);
        studentArray[8] = new Students("Genka", 4.25);
        studentArray[9] = new Students("Pesho", 4.50);

        Arrays.sort(studentArray);

        for (Students student : studentArray) {
            System.out.println(student.getStudentName() + " - " + student.getStudentGrade());
        }


    }


}
