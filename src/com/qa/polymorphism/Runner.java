package com.qa.polymorphism;

public class Runner {
    public static void main(String[] args) {
        Technology tech = new Technology();
        MobilePhone mobile = new MobilePhone();

        tech.hasBigScreen();
        mobile.hasBigScreen();
    }

}
