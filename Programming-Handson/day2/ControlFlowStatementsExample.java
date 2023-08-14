package javatraining.day2;

import java.util.List;

public class ControlFlowStatementsExample {

    public static void main(String[] args) {

        //1. if-else Statement:
        ifElseStatement();

        //2. switch Statement:
        switchStatement();

        //3. while Loop:
        whileLoop();

        //4. do-while Loop:
        doWhileLoop();

        //5. for Loop:
        forLoop();


        //6. break Statement:
        breakStatement();

        //7. continue Statement:
        continueStatement();


    }

    private static void continueStatement() {
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                continue; // Skip the iteration when i is 3
            }
            System.out.println("Value: " + i);
        }
    }

    private static void breakStatement() {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // Exit the loop when i is 5
            }
            System.out.println("Value: " + i);
        }
    }

    private static void forLoop() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }


        int i = 1;
        while (i<=5) {
            System.out.println("Iteration: " + i);
            i++;
            int j = 0;
            while (j <= 5) {
                j++;
            }
        }

       /* List<String> list = null;
        for(String s : list) {

        }*/
    }

    private static void doWhileLoop() {
        int num = 1;

        do {
            System.out.println("Number: " + num);
            num++;
        } while (num <= 5);
    }

    private static void whileLoop() {
        int count = 1;

        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }
    }

    private static void switchStatement() {
        int dayOfWeek = 2;

        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            // ... other cases ...
            default:
                System.out.println("Invalid day");
        }
    }

    private static void ifElseStatement() {
        int age = 20;

        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }
    }
}
