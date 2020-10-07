package day19.golden_hands_synchron;

public class TilesApplication {
    public static void startApplication(double tilesWidth, double tilesLength,
                                        double roomWidth, double roomLength,
                                        double tilesPrice, double masterPrice) {

        double square = roomWidth * roomLength;
        //System.out.println("Площадь" + square);
        int tilesQuantity = getMeTilesQuantity(roomLength, roomWidth, tilesLength, tilesWidth);
        System.out.println("Техническая распечатка, количество всех плиток: " + tilesQuantity);
        double sumWorkHour = getMeSumWorkHour(square, masterPrice);
        //System.out.println("Техническая распечатка, цена за работу: " + sumWorkHour);

        double sumMaterialCost = getMeMaterialCost(tilesPrice, tilesQuantity);
        double totalSum = sumWorkHour + sumMaterialCost;

        // Как посчитать поломанные
        int wholeTiles = getMeWholeTilesQuantity(roomLength, roomWidth, tilesLength, tilesWidth); // не надо резать
        System.out.println("Техническая распечатка, количество целых плиток: " + wholeTiles);
        int brokenTiles = tilesQuantity - wholeTiles;
        System.out.println("Техническая распечатка, количество резаных плиток: " + brokenTiles);

        // теперь считаем поперёк
        int tilesQuantitySecond = getMeTilesQuantity(roomWidth, roomLength, tilesLength, tilesWidth);
        int wholeTilesSecond = getMeWholeTilesQuantity(roomWidth, roomLength, tilesLength, tilesWidth);
        int brokenTilesSecond = tilesQuantitySecond - wholeTilesSecond;
        System.out.println("поперёк: Техническая распечатка, количество всех плиток: " + tilesQuantitySecond);
        System.out.println("поперёк: Техническая распечатка, количество целых плиток: " + wholeTilesSecond);
        System.out.println("поперёк: Техническая распечатка, количество резаных плиток: " + brokenTilesSecond);

    }

    private static int getMeWholeTilesQuantity(double roomLength, double roomWidth, double tilesLength, double tilesWidth) {
        tilesLength = tilesLength / 100; // правильнее создать новую переменную tilesLengthInMeter
        tilesWidth = tilesWidth / 100;
        int countTilesInOneLineLength = (int) Math.floor(roomLength / tilesLength);
        int countTilesInOneLineWidth = (int) Math.floor(roomWidth / tilesWidth);
        int result = countTilesInOneLineLength * countTilesInOneLineWidth;
        return result;
    }

    protected static double getMeMaterialCost(double tilesPrice, int tilesQuantity) {
        return tilesPrice * tilesQuantity;
    }

    static double getMeSumWorkHour(double square, double masterPrice) {
        return square * masterPrice;
    }

    private static int getMeTilesQuantity(double roomLength, double roomWidth, double tilesLength, double tilesWidth) {
        tilesLength = tilesLength / 100; // правильнее создать новую переменную tilesLengthInMeter
        tilesWidth = tilesWidth / 100;
        int countTilesInOneLineLength = (int) Math.ceil(roomLength / tilesLength);
        int countTilesInOneLineWidth = (int) Math.ceil(roomWidth / tilesWidth);
        int result = countTilesInOneLineLength * countTilesInOneLineWidth;
        return result;
    }
}
