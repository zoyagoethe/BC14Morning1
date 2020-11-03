package newCourseDay2.lesson2;

public class PersonArray {
    public static void main(String[] args) {
        Person p1 = new Person("Anton", 100, 200, 31);
        Person p2 = new Person("Merkel", 120, 190, 15);
        Person p3 = new Person("Putin", 75, 166, 45);
        Person p4 = new Person("Macron", 108, 172, 10);
        Person p5 = new Person("Trump", 88, 182, 70);
        Person p6 = new Person("Biden", 49, 155, 100);
        Person p7 = new Person("Merz", 92, 199, 28);
        Person p8 = new Person("Lachet", 97, 187, 14);
        Person p9 = new Person("Caligula", 56, 152, 53);
        Person p10 = new Person("Peter", 115, 202, 37);
        Person[] arrP = new Person[]{p1, p2, p3, p4, p5, p6, p7, p8, p9, p10};
        bubbleSort(arrP);
        printArr(arrP);

        /*System.out.println(arrP[0].age);
        System.out.println(p1.age);
        System.out.println(arrP[7].bmi);
        System.out.println(p1);
        Person p13 = p1;
        System.out.println(p13);
        p13.displayInfo();
        p1.displayInfo();
        p13.name = "Sergej";
        p13.displayInfo();
        p1.displayInfo();*/
    }

    private static void printArr(Person[] arr) {
        for (Person user : arr) {
            user.displayInfo();
        }

    }


    private static void bubbleSort(Person[] arr) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].age > arr[i + 1].age) {
                    Person temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    unsorted = true;
                }
            }
        }
    }
}
