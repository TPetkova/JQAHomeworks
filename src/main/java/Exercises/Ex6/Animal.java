package Exercises.Ex6;

public abstract class Animal {
    int age;
    String name;
    String gender;
    public Animal(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    public abstract int getAge();
    public abstract String getName();
    public abstract String getGender();
    public abstract String makeSound();
}
