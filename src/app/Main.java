package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DataProvider dataProvider = new DataProvider();
        Corrector corrector = new Corrector();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of words:");
        int count = scanner.nextInt();
        scanner.nextLine();

        String[] userWords = new String[count];
        System.out.println("Enter " + count + " words:");

        for (int i = 0; i < count; i++) {
            userWords[i] = scanner.nextLine();
        }

        String result = corrector.handleData(userWords);

        getOutput(result);

        scanner.close();
    }

    private static void getOutput(String output) {
        System.out.println("Corrected words:");
        System.out.println(output);
    }
}
