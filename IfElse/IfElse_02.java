package com.mycompany.meinerstesprogramm;

import java.util.Scanner;

public class SimonsDisco_v3 {
    
    public static void main(String[] args) {

        // Headline
        System.out.println("***************************************");
        System.out.println("Willkommen in Simon's Disco");
        System.out.println("---------------------------------------");

        // Scanner-object
        Scanner survey = new Scanner(System.in);

        // Variables
        String name;
        String age;
        String sex;
        String dance;
        String accompaniment;

        // Questions
        System.out.println("What's your name? ");
        name = survey.nextLine();
        System.out.println("Are you 18 years old or older? (yes/no) ");
        age = survey.nextLine();
        System.out.println("What's your sex? (female/male) ");
        sex = survey.nextLine();
        
        if (age.equalsIgnoreCase("yes") && sex.equalsIgnoreCase("female") || (age.equalsIgnoreCase("yes") && sex.equalsIgnoreCase("male"))) {
            System.out.println("Can you dance? (yes/no) ");
            dance = survey.nextLine();
            if (dance.equalsIgnoreCase("yes")) {
                System.out.println("Hey, " + name + "! " + "You're killing it! Go and get the party started!");
            } else {
                System.out.println("Sorry, " + name + ". " + "No dance skills, no entry! Please take some lessons.");
            }
        } else {
            System.out.println(name + ", sweetheart, you're way too young.");
            System.out.println("Drink some honey milk to help you grow faster!");
        }
    }
}
