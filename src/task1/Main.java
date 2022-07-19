package task1;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = Calculator.instance.get();

        int a = calculator.plus.apply(1, 2);
        int b = calculator.minus.apply(1, 1);
        int c = calculator.devide.apply(a, b);

        calculator.println.accept(c);  //Если a = 3 и b = 0, то делить на 0 нельзя и выбрасывает ошибку.

    }
}
