public class BlackJack {

    public static void main(String[] args) {

        System.out.println(blackJack(10, 21));
        System.out.println(blackJack(20, 18));
        System.out.println(blackJack(1, 22));
        System.out.println(blackJack(22, 23));
        System.out.println(blackJack(22, 8));



    }

    public static int blackJack(int num1, int num2) {
        if (num1 <= 0 || num2 <= 0) {
            return -1;
        } else {
            if (num1 <= 21 && (num1 > num2 || num2 > 21)) {
                return num1;
            } else if (num2 <= 21 && (num2 > num1 || num1 > 21)) {
                return num2;
            } else {
                return 0;
            }

        }
    }

}
