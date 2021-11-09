package com.qa.personexercise;

public class Runner {
    public static void main(String[] args) {

        Person jamie = new Person("Jamie", "Software Engineer", 29, 183, 10.5);
        Person ken = new Person("Ken", "Vet", 37, 174, 11);
        Person amy = new Person("Amy", "Drone Pilot", 23, 167, 6);
        Person kat = new Person("Kat", "Streamer", 25, 165, 6);

        jamie.greet();
        ken.greet();
        amy.greet();
        kat.greet();

        jamie.otherDetails();
        ken.otherDetails();
        amy.otherDetails();
        kat.otherDetails();

    }
}
