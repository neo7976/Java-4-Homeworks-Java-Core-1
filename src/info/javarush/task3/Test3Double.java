package info.javarush.task3;

import java.util.Arrays;
import java.util.List;

public class Test3Double {

    public static final int DIVIDER = 2;

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 13, 26, 25, 45, 78);
        List<Integer> result = list.stream()
                .filter(x -> x % DIVIDER == 0)
                .toList();

        for (Integer integer : result) {
            System.out.printf("%2d делится на %2d и равно: %s\n", integer, DIVIDER,integer / DIVIDER);
        }
    }
}
