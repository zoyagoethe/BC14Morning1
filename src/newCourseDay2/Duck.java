package newCourseDay2;

public class Duck {
    String breed;
    int age;
    String color;
    String name;

    void displayInfo(){
        System.out.println("Race of Duck: " + breed);
        System.out.println("Age of Duck: " + age);
        System.out.println("Color of Duck: " + color);
        System.out.println("Name of Duck: " + name);
    }
    void swims() {
        System.out.println("Duck swims.");
    }
    void quacks(){
        System.out.println("Duck quacks.");
    }
    void flies(){
        System.out.println("I can fly.");
    }
    void eats(){
        System.out.println("Duck eats.");
    }
}
