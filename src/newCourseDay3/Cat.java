package newCourseDay3;

class TestCat {
    public static void main(String[] args) {
        Cat catchen = new Cat("Tiger");
        Cat siam1 = new Cat("Pharao",
                "2020-11-04",
                "m",
                "silver",
                100);

        Address siam1Address = new Address("Berlin", "Kudamm");
        siam1Address.houseNumber = 56;
        siam1Address.zip = "00000";

        siam1.address = siam1Address;
        Address adr = new Address("Москва", "Ленина");

        Cat barsik = new Cat("Барсик", new Address("Dresden", "Lenina"));
        Cat puzik = new Cat("Пузик", adr);
    }
}

public class Cat {
    String name;
    String birthDate;
    String breed;
    String color;
    int chipID;
    String gender;
    double weight;
    double height;
    double price;
    boolean passport;
    Address address;
    double bmIndex;

    //final Long VERSION = 2020_11_04_10_07L;// версионирование, java, ubuntu, android

    Cat(String name) {}

    Cat(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    Cat(String name, String breed) {
    }

    Cat(String name, String birthDate, String gender, String color, int price) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.color = color;
        this.price = price;
        //this.bmIndex = price * price;// просто формула для примера - ПЛОХАЯ ПРАКТИКА
        //setBmIndex();
        this.setBmIndex();
    }

    Cat(String catName, String catBirthDate, String catGender, String catColor) {
        name = catName;
        birthDate = catBirthDate;
        gender = catGender;
        color = catColor;
    }

    void setBmIndex() {
        this.bmIndex = price * price;
    }
}

class Address {
    private String city;
    //protected String city; - так тоже можно - скопус меняется
    private String street;
    int houseNumber;
    String zip;

    Address(String city, String street){

    }

}




