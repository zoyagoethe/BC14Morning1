// 1. Напишите программу действий для сотрудника дорожной полиции, который остановил машину:
//при езде до 50 км/час нарушений нет;
//за езду от 50 км/час до 65 км/час — устное порицание и лекция на 5 минут;
//за превышение скорости от 16 км/час — 40 евро штрафа;
//за езду от 100 км/час до 130 км/час — штраф 500 евро;
//и за езду свыше

package day9;

public class carIncident {
    public static void main(String[] args) {
        int speed = 131;

        if (speed <= 50) {
            System.out.println("You are OK");
        } else if (speed <= 65) {
            System.out.println("oral reprimand and a lecture for 5 minutes");
        } else if (speed <= 100) {
            System.out.println("40 euro fine");
        } else if (speed <= 130) {
            System.out.println("500 euro fine");
        } else {
            System.out.println("You are dead");
        }

    }
}
