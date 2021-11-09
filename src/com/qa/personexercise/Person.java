package com.qa.personexercise;

public class Person {

        private String name;
        private String jobTitle;
        private int age;
        private double height;
        private double shoeSize;

    public Person(String name, String jobTitle, int age, double height, double shoeSize) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.height = height;
        this.shoeSize = shoeSize;
    }

    public Person(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public void greet() {
        System.out.println("My name is " + name + ". I am " + age + " years old and I am a " + jobTitle + ".");
    }

    public void otherDetails() {
        System.out.println("My height is " + height + " and my shoe size is " + shoeSize + ".");
    }
}
