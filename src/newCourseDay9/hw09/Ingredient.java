package newCourseDay9.hw09;

public class Ingredient {
    private String name;
    private boolean alcohol;
    private int liquid;
    private int piece;
    private int perCent;

    public Ingredient(String name, boolean alcohol, int liquid, int perCent) {
        this.name = name;
        this.liquid = liquid;
        this.perCent = perCent;
        this.alcohol = alcohol;
    }

    public Ingredient(String name, int piece) {
        this.name = name;
        this.piece = piece;
    }

    @Override
    public String toString() {
        return "\nIngredient{" +
                "name='" + name + '\'' +
                ", alcohol=" + alcohol +
                ", liquid=" + liquid +
                ", perCent=" + perCent +
                '}';
    }

    public int getLiquid() {
        return liquid;
    }

    public double getAlcohol(){
        return liquid / 100 * perCent;
    }
}
