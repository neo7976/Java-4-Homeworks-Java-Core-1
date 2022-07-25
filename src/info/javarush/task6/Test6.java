package info.javarush.task6;

import info.javarush.task5.MyTestFunction5;

/**
 * Используя функциональный интерфейс из задачи 5 написать лямбда-выражение,
 * которое возвращает результат операции a * b^c
 */

public class Test6 {
    public static void main(String[] args) {
        MyTestFunction5<Double> test = (a, b, c) -> (a * Math.pow(b, c));
        Double aDouble = test.discriminant(2.65, 2.8, (double) 2);
        System.out.printf("%.2f", aDouble);
    }
}
