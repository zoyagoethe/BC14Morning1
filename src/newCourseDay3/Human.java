package newCourseDay3;

public class Human {
    private String name;
    public int speed;
    Dog dog;

    //Constructor
    public Human() {

    }

    public Human(String name) {
        this.name = name;
    }

    public Human(String name, Dog dog) {
        this.name = name;
        this.dog = dog;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void walk(int speed) {
        this.speed = speed;
    }

    public void walkWithDog(int speed) {
        walk(speed);
        dog.runAround(speed * 3);
    }

}

class Dog {
    private String nameDog;
    private int speedDog;

    public Dog(String name) {
        this.nameDog = name;
    }

    public void runAround(int skorost) {
        this.speedDog = skorost;
        System.out.println("Dog's speed: " + speedDog);
    }

    public void eat() {
        System.out.println("Give me meet!");
    }

    int getSpeedDog() {
        return this.speedDog;
    }
}
