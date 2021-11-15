package com.qa.exceptions;



public class Maths {

    public int division(int a, int b) throws MathsExceptions {

        if (a == 1 || b == 1) {
            throw new MathsExceptions();
        }
        if (a < b) {
            throw new MathsExceptions();
        }

        return a / b;
    }

}
