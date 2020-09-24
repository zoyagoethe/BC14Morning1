package day4;

public class MyLovelyString {
    public static void main(String[] args) {
        String myFirstString = "Это моё первое предложение";
        System.out.println(myFirstString);
        String s1 = "";
        String s2 = " ";

        String result = "моё второе предложение " + myFirstString + " моё третье предложение" + s2;
        System.out.println(result);


    }
}
