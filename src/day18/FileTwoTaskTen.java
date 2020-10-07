/*
package day18;

public class FileTwoTaskTen {
    public static void main(String[] args) {
        */
/*1. figurenoberflaechen berechnen
        2. alle oberflaechen addieren
        3. eine geeingnete einheit finden
        4. farbenmenge berechnen
        5. anzahl der farbdosen berechnen
        6. kosten berechnen*//*

        double flaeche1 = flaecheSphaere(58);
        double flaeche2 = flaecheWuerfel(40);
        double flaeche3 = flaechePyramide(30, 20);
        double flaeche4 = flaecheQuader(80, 30, 20);
        double gesamtFlaeche = flaeche1 + flaeche2 + flaeche3 + flaeche4;
        double mengeFarbe = findeFarbenMenge(gesamtFlaeche, 560);
        int anzahlDosen = countDosen(mengeFarbe);
        double price = priceCount(mengeDosen, 17.00);
        System.out.println();
    }

    private static int countDosen(int mengeDosen) {
        System.out.println("moegliche dosenmenge " + (int) Math.ceil(mengeFarbe/400));
        return (int) Math.ceil(mengeFarbe/400);
    }

    private static double priceCount(double menge, double price) {
        return mengeDo;
    }

    private static double findeFarbenMenge(double f, int ml) {
        f = f / 10000;//aus quadratcantimeter in quadratmeter
        return f * ml;
    }

    private static double flaechePyramide(int ground, int side) {
        double a = ground;
        double b = side;
        return (b * Math.sqrt(a * a - ((b * b) / 4))) / 2;
    }

    private static double flaecheQuader(int a, int b, int c) {
        return 2 * (a * b + b * c + a * c);
    }

    private static double flaecheWuerfel(int side) {
        return 6 * side * side;
    }

    private static double flaecheSphaere(int d) {
        return Math.PI * d * d;
    }
}
*/
