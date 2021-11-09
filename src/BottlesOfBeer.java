public class BottlesOfBeer {
    public static void main(String[] args) {

        bottlesOfBeer();
    }

    public static void bottlesOfBeer() {

        int bottles = 99;

        while (bottles > 1) {
            bottles --;
            System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer.\n Take one down and pass it around, " + (bottles -1) + " bottles of beer on the wall.");
        }

        System.out.println("No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.");

    }

}
