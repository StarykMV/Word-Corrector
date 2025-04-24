package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DataProvider dataProvider = new DataProvider();
        Corrector corrector = new Corrector();

        Scanner scanner = new Scanner(System.in);
        String userInput;

        while (true) {
            System.out.println("Enter the number of words (or type 'exit' to quit):");
            userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {
                break;
            }

            int count;
            try {
                count = Integer.parseInt(userInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                continue;
            }

            String[] userWords = new String[count];
            System.out.println("Enter " + count + " words:");

            for (int i = 0; i < count; i++) {
                userWords[i] = scanner.nextLine();
            }

            String result = corrector.handleData(userWords);

            getOutput(result);
        }

        scanner.close();
        System.out.println("Program has exited.");
    }

    private static void getOutput(String output) {
        System.out.println("Corrected words:");
        System.out.println(output);
    }
}
