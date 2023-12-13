import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format(" The value of pi is approximately %.2f.%n",pi);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Grab an integer: ");
        int num= scanner.nextInt();

        System.out.println("User entered: " + num);

        System.out.print(" Enter in 3 words: ");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();



        System.out.printf("Word 1: %s%n", word1);
        System.out.printf("Word 1: %s%n", word2);
        System.out.printf("Word 1: %s%n", word3);

        System.out.print("lets talk about it: ");
        scanner.nextLine();
        String story = scanner.nextLine();
        System.out.println(" lets go: \"" + story + "\"");

    }
}
