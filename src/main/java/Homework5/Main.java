package Homework5;

public class Main {
    public static void main(String[] args) {
        Person[] personArray = new Person[10];

        Person person1 = new Person("", 0, true);
        person1.setName("John");
        person1.setAge(22);
        person1.setIsMan(true);
        personArray[0] = person1;

        Person person2 = new Person("", 0, true);
        person2.setName("Mary");
        person2.setAge(19);
        person2.setIsMan(false);
        personArray[1] = person2;

        Student student1 = new Student("", 0, true, 0.0);
        student1.setName("Jack");
        student1.setAge(21);
        student1.setIsMan(true);
        student1.setScore(4.5);
        personArray[2] = student1;

        Student student2 = new Student("", 0, true, 0.0);
        student2.setName("Lili");
        student2.setAge(18);
        student2.setIsMan(false);
        student2.setScore(6.0);
        personArray[3] = student1;

        Employee employee1 = new Employee("", 0, true, 0);
        employee1.setName("Kalina");
        employee1.setAge(28);
        employee1.setIsMan(false);
        employee1.setDaySalary(100);
        personArray[4] = employee1;

        Employee employee2 = new Employee("", 0, true, 0);
        employee2.setName("George");
        employee2.setAge(35);
        employee2.setIsMan(true);
        employee2.setDaySalary(250);
        personArray[5] = employee2;

        for (Person person : personArray) {
            if (person instanceof Student) {
                ((Student) person).showStudentInfo();
            } else if (person instanceof Employee) {
                ((Employee) person).showEmployeeInfo();
            } else if (person != null) {
                person.showPersonInfo();
            }
        }

        for (Person person : personArray) {
            if (person instanceof Employee) {
                System.out.println(((Employee) person).calculateOvertime(2));
            }
        }

    }


}
