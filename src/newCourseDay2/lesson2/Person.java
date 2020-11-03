package newCourseDay2.lesson2;

public class Person {
    String name;
    double weight;
    double height;
    int age;
    double bmi;

    public Person() {

    }

    public Person(String userName, double userWeight, double userHeight, int userAge) {
        age = userAge;
        weight = userWeight;
        height = userHeight;
        name = userName;
        findBMI();
    }

    public Person(String userName, double userWeight, double userHeight) {
        weight = userWeight;
        height = userHeight;
        name = userName;
        findBMI();
    }

    void findBMI() {
        bmi = weight * 10000 / (height * height);
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);
        System.out.println("Age: " + age);
        System.out.println("BMI: " + bmi);
        System.out.println();
    }


}

class PersonTest {
    public static void main(String[] args) {
        /*Person hausmeister = new Person();
        hausmeister.name = "Vasilij";
        hausmeister.weight = 100;
        hausmeister.height = 200;
        hausmeister.findBMI();*/
        //hausmeister.displayInfo();
        Person user = new Person("vasilij", 100, 200);
        user.displayInfo();
        Person vova = new Person("Vovan", 125, 175);
        vova.displayInfo();
    }
}