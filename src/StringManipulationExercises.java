
public class StringManipulationExercises {
    public static void main(String[] args) {

        String yesterday = "yesterday it was raining";
        String today = "today it is sunny";

        System.out.println(today.toUpperCase() + ", " + yesterday.toUpperCase());

        System.out.println(today.toUpperCase().substring(0, 11) +  yesterday.toUpperCase().substring(16, 24));

    }
}
