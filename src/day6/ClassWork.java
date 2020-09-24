package day6;

public class ClassWork {
    public static void main(String[] args) {
        String name = "Bob";
        System.out.println(helloName(name));

    }

    private static String helloName(String userName) {
        return "Hello " + userName + "!";
    }
}
