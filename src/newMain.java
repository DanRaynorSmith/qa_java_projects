public class newMain {

    public static void main(String[] args) {

        displayResults();
        percentage();

    }

    public static void displayResults() {
        int physics = 130;
        int chemistry = 135;
        int biology = 120;
        int total = physics + chemistry + biology;

        System.out.println("Physics score = " + physics);
        System.out.println("Chemistry score = " + chemistry);
        System.out.println("Biology score = " + biology);
        System.out.println("Total score = " + total);
    }

    public static void percentage() {
        double physics = 130;
        double chemistry = 135;
        double biology = 120;
        double total = physics + chemistry + biology;
        double percentage = ((total * 100d) / 450d);

        System.out.println("Overall percentage result = " + String.format("%.2f", percentage));
    }

}
