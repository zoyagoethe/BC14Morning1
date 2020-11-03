package newCourseDay2.lesson2;

public class Car {
    String brand;
    String win;// motor ID
    String color;
    int tiles;
    int doors;
    int mileAge;

    void move(int km) {
        System.out.println("Car has driven: " + km);
        mileAge += km;
    }
}

class CarTest {
    public static void main(String[] args) {
        Car myFirstCar = new Car();
        myFirstCar.brand = "Ferrari";
        myFirstCar.move(100);
        System.out.println("Mileage ist: " + myFirstCar.mileAge);
        myFirstCar.move(300);
        System.out.println("Mileage ist: " + myFirstCar.mileAge);
        myFirstCar.mileAge = 0;
        System.out.println("Mileage ist: " + myFirstCar.mileAge);
    }
}