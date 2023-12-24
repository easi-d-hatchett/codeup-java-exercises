
import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {


  // int i = 5;
//
//
//
//        int i = 1;
//
//
//        while (i <= 15) {
//            System.out.println("i is: " + i);
//
//            i++;
//        }
//
//        System.out.println("complete.");

//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);

//
//        int i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i <= 10000);

//        for (int i = 0; i <= 100; i += 2) {
//            System.out.println(i);
//        }


                // For loop that counts backward by 5's from 100 to -10
                for (int i = 100; i >= -10; i -= 5) {
                    System.out.println(i * i);
                }

        System.out.println("FizzBuzz:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        // Table of powers
        System.out.println("\nTable of Powers:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        System.out.printf("%-10s%-10s%-10s%n", "Number", "Square", "Cube");

        for (int i = 1; i <= num; i++) {
            int square = i * i;
            int cube = i * i * i;
            System.out.printf("%-10d%-10d%-10d%n", i, square, cube);
        }

        // Ask if the user wants to continue
        System.out.print("Do you want to continue? (yes/no): ");
        String continueResponse = scanner.next();

        if (continueResponse.equalsIgnoreCase("yes")) {
            // Continue with additional logic or loops
            System.out.println("Continuing...");
        } else {
            System.out.println("Program terminated.");
        }

        scanner.close();
    }
            }



