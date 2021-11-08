public class Calculator {
    public static void main(String[] args) {

        System.out.println(multiplication(2, 5));
        System.out.println(subtraction(10, 5));
        System.out.println(division(12, 7));

    }

    public static double multiplication(double number1, double number2) {
        return number1 * number2;
    }

    public static double subtraction(double number1, double number2) {
        return number1 - number2;
    }

    public static double division(double number1, double number2) {
        if (number1 > number2) {
            System.out.println("Division cannot be performed");
            return -1;
        }
        return number1 / number2;
    }

}
