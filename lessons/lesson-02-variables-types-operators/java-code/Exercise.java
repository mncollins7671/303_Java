import java.util.Scanner;

// EXERCISE: Calculator
// Read two numbers from the user.
// Print their sum, difference, product, quotient, and REMAINDER.

public class Exercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // TODO: Read two integers from the user
        System.out.print("Enter first number: ");
         int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();


        // TODO: Print the results
         System.out.println("Sum: " + (num1 + num2));
         System.out.println("Difference: " + (num1 - num2));
         System.out.println("Product: " + (num1 * num2));

        // BONUS: What happens if num2 is 0?
        if (num2 != 0) {
            System.out.println("Quotient: " + (num1 / num2));
            System.out.println("Remainder: " + (num1 % num2));
        } else {
            System.out.println("Cannot divide by zero!");
        }
        // BONUS: Use printf to format the output nicely
        System.out.printf("%nFormatted: %d + %d = %d%n", num1, num2, num1 + num2);

        sc.close();
    }
}
