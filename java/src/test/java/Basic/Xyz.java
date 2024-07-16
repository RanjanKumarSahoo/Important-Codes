package Basic;

import java.util.Scanner;

public class Xyz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        printRomanNumerals(numbers);

        scanner.close();
    }

    public static void printRomanNumerals(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(toRomanNumeral(numbers[i]));
        }
    }

    public static String toRomanNumeral(int number) {
        String[] romanNumerals = {"I", "II", "III", "IV", "V"};

        if (number >= 1 && number <= 5) {
            return romanNumerals[number - 1];
        } else {
            return "Invalid input, please enter a number between 1 and 5 inclusive.";
        }
    }
}