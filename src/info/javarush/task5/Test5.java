package info.javarush.task5;

public class Test5 {
    public static void main(String[] args) {
        MyTestFunction5<Double> example = (a, b, c) -> b * 2 - 4 * a * c;

        Double aDouble = example.discriminant(2.1, 2.5, 2.6);
        System.out.println(aDouble);

    }
}
