package com.mycompany.meinerstesprogramm;

import java.util.Scanner;

public class DoWhile_v8 {

    public static void main(String[] args) {

        System.out.println("---------------- HELLO ----------------");

        Scanner survey = new java.util.Scanner(System.in);

        // User's input starting number
        System.out.println("Please enter a starting number: ");
        int min = survey.nextInt();
        survey.nextLine();

        // User's input final number
        System.out.println("Please enter a final number: ");
        int max = survey.nextInt();
        survey.nextLine();

        // Check valid final number
        while (max <= min) {
            System.out.println("\033[1;31m" + "The final number must be greater than the starting number. " + "\033[0m");
            System.out.println("Please enter a final number that is greater than " + min + ": ");
            max = survey.nextInt();
            survey.nextLine();
        }

        // Check difference between start and final number
        int differenceStep = max - min;

        // User's input step number
        System.out.println("Please enter a number for the steps between starting and final number: ");
        int step = survey.nextInt();

        // Check step number
        while (step <= 0 || (differenceStep % step != 0)) {
            System.out.println("\033[1;31m" + "This number for steps does not match between the starting number " + min + " and the final number " + max + "." + "\033[0m");

            // Suggestion for suitable step numbers
            printValidSteps(differenceStep);

            System.out.println("Please enter a valid step number: ");
            step = survey.nextInt();
        }

        // User' input highlight number
        System.out.println("Please enter a number to highlight in the sequence: ");
        int highlight = survey.nextInt();

        // Check for valid highlight number
        while (highlight < min || highlight > max) {
            System.out.println("\033[1;31m" + "This number is not part of the sequence. " + "\033[0m");
            System.out.println("Please enter a valid number to highlight between " + min + " and " + max + " : ");
            highlight = survey.nextInt();
        }
        // Output of number sequence & highlighted number between two steps
        System.out.println("Number sequence based on your inputs: ");
        int current = min;

        // Standard highlight
        int standardHighlight = 20;

        // Variable to track if we have printed the highlight message
        boolean highlightedPrinted = false;

        while (current <= max) {
            // Check for standard highlight
            if (standardHighlight == current && highlight != current) {
                System.out.println(current + " ---> " + "\033[1;36m" + "BINGO!" + "\033[0m");
            }
            // Check if the highlight number is exactly on a current step
            if (highlight == current && standardHighlight != current) {
                System.out.println(current + "\033[1;32m" + " ---> JACKPOT!" + "\033[0m");
                highlightedPrinted = true;
            }
            // Check if highlight number is standard highlight number & on a valid step
            if (highlight == current && standardHighlight == current) {
                System.out.println(current + " ---> " + "\033[1;36m" + "BINGO" + "\033[0m" + " & " + "\033[1;32m" + "JACKPOT" + "\033[0m" + " !!!");

            } // Check if the highlight number lies between current and the next step
            else if (highlight > current && highlight < current + step) {
                System.out.println(current);
                int differNumb = current;  // The previous number in the sequence
                int difference = highlight - differNumb; // Difference between the highlight and current number

                // Print the highlight number with a message explaining its position
                System.out.println("\033[1;33m" + highlight + "\033[0m" + " ---> " + "\033[1;33m" + "Your entered number " + highlight + " is " + difference + " step(s) after " + differNumb + "." + "\033[0m");

                // Set the flag to indicate that we printed the highlight message
                highlightedPrinted = true;
            } else if (current != highlight & current != standardHighlight) {
                // Print the current number if it is not the highlight or the standard highlight
                System.out.println(current);
            }
            // Increment current by step
            current += step;

        }
    }

    // Method to calculate and display valid step numbers (divisors)
    public static void printValidSteps(int difference) {
        System.out.print("You can enter one of the following valid step numbers: ");
        for (int i = 1; i <= difference; i++) {
            if (difference % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
