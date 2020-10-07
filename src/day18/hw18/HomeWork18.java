package day18.hw18;

/*Мастеру плиточнику Сергею Ивановичу Золотыеруки задают часто один и тот же вопрос:
        сколько будет стоить положить плитку на определённом участке.

        Нам известно, что в час он кладёт примерно один квадратный метр плитки.
        Его час стоит 27€ без НДС.
        Стандартная плитка 30 на 20 сантиметров.
        Сергей Иванович обратился к нам за помощью и вам надо написать для него программу.
        Которая будет принимать размеры стены/пола, стоимость плитки и выдавать:

        1. Количество требуемых плиток, как целых, так и тех которые надо будет резать:
         - учтите, что плитку можно класть как вдоль, так и поперёк,
         и только на месте мастер узнает, как именно её надо класть.
        2. Стоимость материала
        3. Стоимость рабочего времени
        4. Итоговую ориентировочную стоимость*/

public class HomeWork18 {
    public static void main(String[] args) {
        double length1 = 0.3;
        double width1 = 0.2;
        double priceHour = 27.0;
        double surfaceBathroom = countTotalSurface(2.25, 3.10, 2.15);
        double surfaceTile = countTileSurface(0.3, 0.2);
        System.out.println(bathroomTiles(2.25, 3.10, 2.15, 5.00));
        System.out.println("Total Bathroom Surface " + countTotalSurface(2.25, 3.10, 2.15));
        System.out.println("Tile Surface " + countTileSurface(0.3, 0.2));
        System.out.println("Total Tiles Count " + tileCount(30.29, 0.06));
        System.out.println("Tiles Price " + costTiles(504.83, 5.0));
        System.out.println("Working Time Price " + workingTimeCost(30.29, 27.0));
        System.out.println("Total Price " + totalPrice(2524.15, 817.83));

    }

    private static double totalPrice(double costMaterials, double timeCost) {
        return costMaterials + timeCost;
    }

    private static double workingTimeCost(double surfaceBathroom, double priceHour) {
        double timeCost = surfaceBathroom * priceHour;
        return timeCost;
    }

    private static double costTiles(double countTiles, double priceTile) {
        double costMaterials = countTiles * priceTile;
        return costMaterials;
    }

    private static double countTileSurface(double length1, double width1) {
        return length1 * width1;
    }

    private static double tileCount(double surfaceBathroom, double surfaceTile) {
        double countTiles = surfaceBathroom / surfaceTile;
        return countTiles;
    }

    private static double countTotalSurface(double height, double length, double width) {
        double surfaceBathroom = length * width + 2 * length * height + 2 * width * height;
        return surfaceBathroom;
    }

    private static double bathroomTiles(double height, double length, double width, double priceTile) {
        double result = 0.0;

        return result;
    }
}
