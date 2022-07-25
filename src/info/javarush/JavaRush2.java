package info.javarush;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Скорее всего информация к следующей лекции по Stream

public class JavaRush2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        for (Integer n : list) {
            int x = n * n;
            System.out.printf("%d ", x);
        }
        System.out.println();

        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        list2.stream().map((x) -> x * x + " ").forEach(System.out::print);

        System.out.println();
        System.out.println("Возводим и выводим только чётные числа:");
        list2.stream().filter(x -> x % 2 == 0).map((x) -> x * x + " ").forEach(System.out::print);

        System.out.println();
        System.out.println("Возводим только чётные числа, пробуем вывести все:");
        list2.stream().map((x) -> {
            if (x % 2 == 0) return x * x + " ";
            else return x + " ";
        }).forEach(System.out::print);
    }
}
