import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListLesson {
    public static void main(String[] args) {

        List<Integer> myNumbers = new ArrayList<>(); // Have to use Integer, the wrapper class for int, or it doesn't work. List needs the functionality of the wrapper class.
        List<String> names = new ArrayList<>();

        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(3);
        myNumbers.add(64);
        myNumbers.add(32);

        names.add("John");
        names.add("Ben");
        names.add("Kate");
        names.add("Ellie");
        names.add("Olivia");

        System.out.println(names);
        System.out.println(names.get(3));

        names.set(0, "Zak");
        System.out.println(names.get(0));

        Collections.sort(names);
        System.out.println(names);

        System.out.println(names.size());

    }
}
