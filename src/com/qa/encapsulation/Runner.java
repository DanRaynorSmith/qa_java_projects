package com.qa.encapsulation;

public class Runner {
    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();

        encapsulation.setStringVar("This is a string");
        encapsulation.setIntVar(5);
        encapsulation.setDoubleVar(15.5d);
        encapsulation.setFloatVar(12.5f);
        encapsulation.setLongVar(1248973957495L);

        System.out.println(encapsulation.getStringVar());
        System.out.println(encapsulation.getIntVar());
        System.out.println(encapsulation.getDoubleVar());
        System.out.println(encapsulation.getFloatVar());
        System.out.println(encapsulation.getLongVar());

        System.out.println(encapsulation);
    }
}
