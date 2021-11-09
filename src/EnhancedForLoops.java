import java.util.ArrayList;
import java.util.List;

public class EnhancedForLoops {
    public static void main(String[] args) {

        List<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(1);
        myNumbers.add(2);
        myNumbers.add(3);
        myNumbers.add(4);
        myNumbers.add(5);
        myNumbers.add(6);
        myNumbers.add(7);
        myNumbers.add(8);
        myNumbers.add(9);
        myNumbers.add(10);
        myNumbers.add(11);
        myNumbers.add(12);
        myNumbers.add(13);
        myNumbers.add(14);
        myNumbers.add(15);
        myNumbers.add(16);
        myNumbers.add(17);
        myNumbers.add(18);
        myNumbers.add(19);
        myNumbers.add(20);

        for (int i : myNumbers) {
            int a = i * i;
            System.out.println(a);
        }

        for (int i : myNumbers) {
            if (integerIsEven(i)) {
                int a = i * i * i;
                System.out.println(a);
            } else {
                int a = i * i;
                System.out.println(a);
            }
        }

    }

    public static boolean integerIsEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }



}
