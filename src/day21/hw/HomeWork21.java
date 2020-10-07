package day21.hw;

//Напишите метод печати для строкового массива (String[] germanCities)
public class HomeWork21 {
    public static void main(String[] args) {
        String[] germanCities = new String[]{"Berlin", "München", "Dresden",
                "Leipzig", "Köln", "Düsseldorf"};
        myPrintStringArray(germanCities);
    }

    private static void myPrintStringArray(String[] input) {
        //for (int i = 0; i < input.length; i++) {
        for (String s : input) {
            //System.out.println(s);
            System.out.print(s + ", ");// до сих пор не знаю, как убрать запятую после последнего элемента
        }
    }
}
