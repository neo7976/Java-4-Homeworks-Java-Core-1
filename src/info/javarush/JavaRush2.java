package info.javarush;

import java.util.Arrays;
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
        list2.stream().map((x) -> x * x).forEach(System.out::println);
    }
}
