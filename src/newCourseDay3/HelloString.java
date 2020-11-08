package newCourseDay3;

public class HelloString {
    public static void main(String[] args) {
        String firstName1 = "Andrej";
        String firstName2 = "Andrej";
        String firstName3 = new String("Andrej");
        String firstName4 = new String("Andrej");

        System.out.println(firstName1 == firstName2);
        System.out.println("OOP" + (firstName1 == firstName2));
        System.out.println("OOP" + firstName1 == firstName2);
        System.out.println("OOP" + firstName2 == firstName3);
        System.out.println("OOP" + firstName3 == firstName4);
        System.out.println("----------------");
        System.out.println(firstName1.equals(firstName2));
        System.out.println(firstName1.equals(firstName3));
        System.out.println(firstName1.equals(firstName4));
        System.out.println(firstName2.equals(firstName3));
        System.out.println(firstName3.equals(firstName4));
    }
}
/*
true
false
false
false
без скобок*/

/*
true
OOPtrue
false
false
со скобками*/
