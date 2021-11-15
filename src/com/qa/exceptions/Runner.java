package com.qa.exceptions;

public class Runner {

    public static void main(String[] args) {

        Maths m = new Maths();

        try {
            System.out.println(m.division(2, 5));
        } catch (MathsExceptions e) {
//            e.divideByOne();
            e.smallerDividedByBigger();
            e.printStackTrace();
        }

    }

}
