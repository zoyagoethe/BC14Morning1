package day26;
//operatora perexoda
public class ClassWork26 {
    public static void main(String[] args) {
        searchFor();
    }

    private static void searchFor() {
        for (int i = 0; i < 20; i++) {
            if (i==4){
                //break;
                continue;
            }
            System.out.println("значение i: " + i);
        }
        System.out.println("Цикл завершён.");
    }
}
