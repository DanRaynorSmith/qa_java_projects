public class UniqueSum {
    public static void main(String[] args) {

        System.out.println(uniqueSum(1, 2, 3));
        System.out.println(uniqueSum(3, 3, 3));
        System.out.println(uniqueSum(1, 1, 2));

    }

    public static int uniqueSum(int num1, int num2, int num3) {
        if (num1 == num2 && num2 == num3) {
            num1 = 0;
            num2 = 0;
            num3 = 0;
        }
        if (num1 == num3) {
            num1 = 0;
            num3 = 0;
        }
        if (num2 == num3) {
            num3 = 0;
            num2 = 0;
        }
        if (num1== num2) {
            num1 = 0;
            num2 = 0;
        }

        return num1 + num2 + num3;


    }

}
