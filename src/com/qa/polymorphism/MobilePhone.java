package com.qa.polymorphism;

public class MobilePhone extends Technology {

    @Override
    public void hasBigScreen() {
        System.out.println("This device has a small screen");
    }

}
