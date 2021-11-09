public class FizzBuzz {
    public static void main(String[] args) {

        fizzBuzz(30);

    }

    public static void fizzBuzz(int num1) {
        if (!(num1 % 3 == 0 || num1 % 5 == 0)) {
            System.out.println(num1);
        } else {

            if (num1 % 3 == 0 && num1 % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (num1 % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println("Buzz");
            }


        }

    }

}
