package info.javarush.task3;


import java.util.Arrays;
import java.util.List;

public class Test3 {

    static final int DIVIDER = 13;

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 13, 26, 25, 45, 78);

        System.out.printf("Пробуем поделить числа на %d: \n", DIVIDER);
        thirteenNumberEquals(list, DIVIDER, integer -> integer % DIVIDER == 0);
    }

    public static void thirteenNumberEquals(List<Integer> list, int n, MyFunctionInterfaceBoolean<Integer> predicate) {
        for (Integer t : list) {
            if (predicate.test(t)) {
                System.out.printf("%d делится на %d и равно %s\n", t, n, t / n);
            }
        }
        System.out.println();
    }
}
