package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private GradeRegister register;

    public UserInterface(GradeRegister register, Scanner scanner) {
        this.scanner = scanner;
        this.register = register;
    }

    public void start() {
        readPoints();
        System.out.println("");
        printGradeDistribution();
    }

    void readPoints(){
        while (true) {
            System.out.println("Points: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            int score= Integer.valueOf(input);

            if (score < 0 || score > 100) {
                System.out.println("Impossible number");
                continue;
            }

            register.addGradeBasedOnPoints(score);
        }
    }

    void printGradeDistribution(){
        int grade = 5;
        while (grade >= 0) {
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println("");

            grade = grade - 1;
        }
    }

    public static void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}

