package newCourseDay3;

public class Test {
    public static void main(String[] args) {
        Human dame = new Human();
        dame.setName("Masha");
        System.out.println(dame.getName());
        dame.walk(3);
        System.out.println("Dame's speed: " + dame.speed);
        Dog dog = new Dog("Tiger");
        dame.dog = dog;
        dame.walkWithDog(10);
        //System.out.println("Скорость собачки " + dog.getSpeedDog());
    }
}
