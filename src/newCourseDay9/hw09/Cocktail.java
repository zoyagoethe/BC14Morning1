package newCourseDay9.hw09;

import java.util.Arrays;

public class Cocktail {
    private String name;
    boolean alcohol;
    private Ingredient[] ingredients;

    public Cocktail(String name, boolean alcohol, Ingredient... ingredients) {
        this.name = name;
        this.alcohol = alcohol;
        this.ingredients = ingredients;
    }

    //количество алкоголя в коктейле (%)
    public double getStrength() {
        int totalVolume = getVolume();
        double totalAlcohol = amountOfAlcohol();
        return totalAlcohol * 100 / totalVolume;
    }

    //количество алкоголя в коктейле (мл)
    public double amountOfAlcohol() {
        int totalAlcohol = 0;
        for (Ingredient ingredient : ingredients) {
            totalAlcohol += ingredient.getAlcohol();
        }
        return totalAlcohol;
    }

    //объём коктейля
    public int getVolume() {
        int totalVolume = 0;
        for (Ingredient ingredient : ingredients) {
            totalVolume += ingredient.getLiquid();
        }
        return totalVolume;
    }

    @Override
    public String toString() {
        return "Cocktail{" +
                "name='" + name + '\'' +
                ", alcohol =" + alcohol + ", " +
                "ingredient=" + Arrays.toString(ingredients) +
                '}';
    }
}
