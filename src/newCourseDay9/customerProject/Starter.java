package newCourseDay9.customerProject;

public class Starter {
    public static void main(String[] args) {
        Ingredient vodka = new Ingredient("vodka", 100);
        Ingredient rom = new Ingredient("rom", 100);
        Ingredient martini = new Ingredient("martini", 100);
        Ingredient cola = new Ingredient("cola", 100);
        Ingredient energizer = new Ingredient("RedBull", 100);

        Cocktail disco = new Cocktail("disco", cola, energizer);
        System.out.println(disco);
    }
}
