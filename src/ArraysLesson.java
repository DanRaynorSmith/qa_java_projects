public class ArraysLesson {
    public static void main(String[] args) {

//        int[] values = {100, 9, 24, 43, 87, 94, 20, 43, 32, 68};
//
//        for (int value : values) {
//            System.out.println(value);
//        }

        int[] moreValues = new int[5];


        for (int i = 0; i < moreValues.length; i++) {
            moreValues[i] = i + 2;
            System.out.println(moreValues[i]);

        }

        for (int i = 0; i < moreValues.length; i++) {
            moreValues[i] *= 10;
            System.out.println(moreValues[i]);


        }


    }


}
