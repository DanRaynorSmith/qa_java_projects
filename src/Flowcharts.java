public class Flowcharts {

    public static void main(String[] args) {

//        System.out.println(flowChat(1, 2, true));
//        System.out.println(flowChat(3, 3, false));
//        System.out.println(flowChat(1, 1, true));
        flow(4000);

    }

    public static int flowChat(int number1, int number2, boolean boolean1) {
        if (boolean1) {
            // SUM numbers
            return number1 + number2;
        } else {
            // MULTIPLY numbers
            return number1 * number2;
        }
    }

    public static void flow(int num1) {
        if (num1 > 2000) {
            System.out.println("A");
            if (num1 < 6000) {
                System.out.println("B");
            }
            if (num1 > 6000) {
                System.out.println("C");
            }
            if (num1 > 4000 && num1 <= 6000) {
                System.out.println("D");
            }
            if (num1 <= 4000) {
                System.out.println("E");
            }
        }
        if (num1 < 2000) {
            System.out.println("1");
            if (num1 > 100) {
                System.out.println("3");
                if (num1 > 600) {
                    System.out.println("5");
                }
                if (num1 <= 600) {
                    System.out.println("4");
                    if (num1 > 500) {
                        System.out.println("6");
                    } else {
                        System.out.println("7");
                    }
                }
            } else {
                System.out.println("2");
            }
        }
    }


}
