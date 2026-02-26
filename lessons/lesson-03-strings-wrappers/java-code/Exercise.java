import java.util.Scanner;

// EXERCISE: Reverse a string and count vowels
// Given a string input, print:
//   1. The string reversed
//   2. The number of vowels (a, e, i, o, u — case insensitive)

public class Exercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // TODO: Reverse the string
        // Hint: loop from the last character to the first
        // Use input.charAt(i) to get each character
        // Build up a new String by concatenating

        StringBuilder reversed = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        System.out.println(reversed);

        // TODO: Count vowels
        // Hint: convert to lowercase first, then check each char
        // "aeiou".indexOf(ch) >= 0 means it's a vowel

        int vowels = 0;
        String toLower =  input.toLowerCase();

        for (int i = 0; toLower.length() > i; i++) {
            char c = toLower.charAt(i);
            if ("aeiou".indexOf(c) >= 0) {
                vowels++;
            }
        }

        System.out.println("Number of vowels: " + vowels);
        sc.close();
    }
}
