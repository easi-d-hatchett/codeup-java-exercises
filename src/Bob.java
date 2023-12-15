import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Whats good playboy' \"Gucci?\" You want to talk about it?");
        while (true) {
            String input = sc.nextLine();
            if (input.endsWith("?")) {
                System.out.println("Sure.");
            } else if (input.endsWith("!")) {
                System.out.println(" Chill bruh!");
            } else if (input.trim().equalsIgnoreCase("")) {
                System.out.println("Thats a bet, I'm not tripping");

            }

        }

    }
}
