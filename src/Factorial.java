public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(8));
    }

    public static int factorial(int number) {
        if (number < 0) {
            return -1;
        }

        int factorial = 1;

        while (number > 0) {
            factorial *= number;
            number--;
        }

        return factorial;

    }

}
