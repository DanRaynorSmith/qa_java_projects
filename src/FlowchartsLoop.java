public class FlowchartsLoop {

    public static void main(String[] args) {

       // aFlow();
       // bFlow();
        // cFlow();
        //dFlow();
        coins(20, 4.58);
    }

    public static void aFlow() {

        for (int a = 100; a < 200; a++) {
            System.out.println("A");
        }
    }

    public static void bFlow() {
        for (int a = 100; a <= 200; a++) {
            if (a % 2 == 0) {
                System.out.println("-");
            } else {
                System.out.println("*");
            }
        }
    }

    public static void cFlow() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(j);
            }
        }
    }

    public static void dFlow() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(i);
            }
        }
    }

    public static void coins(double amount, double cost) {
        double change = amount - cost;
        int twentyPounds = 0;
        int tenPounds = 0;
        int fivePounds = 0;
        int twoPounds = 0;
        int onePound = 0;
        int fiftyPence = 0;
        int twentyPence = 0;
        int tenPence = 0;
        int fivePence = 0;
        int twoPence = 0;
        int onePence =0;

        while (change > 20) {
            twentyPounds++;
            change -= 20;
        }
        while (change > 10) {
            tenPounds++;
            change -= 10;
        }
        while (change > 5) {
            fivePounds++;
            change -= 5;
        }
        while (change > 2) {
            twoPounds++;
            change -= 2;
        }
        while (change > 1) {
            onePound++;
            change -= 1;
        }
        while (change > .5) {
            fiftyPence++;
            change -= .5;
        }
        while (change > .2) {
            twentyPence++;
            change -= .2;
        }
        while (change > .1) {
            tenPence++;
            change -= .1;
        }
        while (change > .05) {
            fivePence++;
            change -= .05;
        }
        while (change > .02) {
            twoPence++;
            change -= .02;
        }
        while (change > .01) {
            onePence++;
            change -= .01;
        }


        System.out.println("Twenty pounds = " + twentyPounds);
        System.out.println("Ten pounds = " + tenPounds);
        System.out.println("Five pounds = " + fivePounds);
        System.out.println("Two pounds = " + twoPounds);
        System.out.println("One pounds = " + onePound);
        System.out.println("Fifty pence = " + fiftyPence);
        System.out.println("Twenty pence = " + twentyPence);
        System.out.println("Ten pence = " + tenPence);
        System.out.println("Five pence = " + fivePence);
        System.out.println("Two pence = " + twoPence);
        System.out.println("One pence = " + onePence);


    }

}
