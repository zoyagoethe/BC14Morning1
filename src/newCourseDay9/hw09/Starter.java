package newCourseDay9.hw09;

public class Starter {
    public static void main(String[] args) {
        Ingredient vodka = new Ingredient("vodka", true, 50, 40);
        Ingredient rom = new Ingredient("rom", true, 50, 54);
        Ingredient martini = new Ingredient("martini", true, 30, 12);
        Ingredient cola = new Ingredient("cola", false, 100, 0);
        Ingredient energizer = new Ingredient("RedBull", false, 100, 0);
        Ingredient liqueur = new Ingredient("Chocolate Liquer", true, 30, 16);
        Ingredient juice1 = new Ingredient("Tomato Juice", false, 100, 0);
        Ingredient juice2 = new Ingredient("Lemon Juice", false, 50, 0);
        Ingredient milk = new Ingredient("Milk", false, 200, 0);
        Ingredient iceCream = new Ingredient("Ice-cream", false, 50, 0);
        Ingredient syrup1 = new Ingredient("Fruit syrup", false, 25, 0);
        Ingredient syrup2 = new Ingredient("Sugar syrup", false, 25, 0);
        Ingredient olive = new Ingredient("Olives", 2);
        Ingredient ice = new Ingredient("Crushed ice", false, 50, 0);

        Cocktail disco = new Cocktail("Disco", false, cola, energizer, ice);
        Cocktail piranha = new Cocktail("Piranha", true, vodka, liqueur, cola, ice);
        Cocktail mary = new Cocktail("Bloody Mary", true, vodka, juice1, ice);
        Cocktail daiquiri = new Cocktail("Daiquiri", true, rom, juice2, syrup2, ice);
        Cocktail vodkaMartini = new Cocktail("James Bond", true, vodka, martini, olive, ice);
        Cocktail milkshake = new Cocktail("Soviet Milkshake", false, milk, iceCream, syrup1);

        /*System.out.println(disco);
        System.out.println();
        System.out.println(piranha);
        System.out.println();
        System.out.println(mary);
        System.out.println();
        System.out.println(daiquiri);
        System.out.println();
        System.out.println(vodkaMartini);
        System.out.println();
        System.out.println(milkshake);
        System.out.println();*/

        Cocktail[] bar = new Cocktail[]{disco, piranha, mary, daiquiri, vodkaMartini, milkshake};
        printBar(bar);
    }

    private static void printBar(Cocktail[] arr) {
        for (Cocktail cocktail : arr) {
            System.out.println(cocktail);
            System.out.println(cocktail.getVolume());
            System.out.println(cocktail.getStrength());
            System.out.println();
        }
    }
}
