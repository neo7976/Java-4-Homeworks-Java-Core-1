package info.javarush.task4;

/**
 * Написать функциональный интерфейс с методом, который принимает две строки и возвращает тоже строку.
 * Написать реализацию такого интерфейса в виде лямбды, которая возвращает ту строку, которая длиннее.
 */

public class Test4 {
    public static void main(String[] args) {

        String s1 = "Я люблю программировать на Java!";
        String s2 = "Java лучше всех!";

        Test4FunctionInterface<String> longerSize = (x, y) -> x.length() > y.length() ? x : y;
        String s = longerSize.stringIsLonger(s1, s2);
        System.out.println(s);
    }
}
