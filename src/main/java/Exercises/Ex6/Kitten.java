package Exercises.Ex6;

public class Kitten extends Animal{
    public Kitten(int age, String name, String gender) {
        super(age, name, gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String makeSound() {
        return "Kitten meow meow meow";
    }
}
