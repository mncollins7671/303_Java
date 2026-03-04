import java.util.Arrays;
import java.util.Scanner;

public class MixedArray {
    public static void main(String[] args) {
        Object[] mixed = {69420, "Dave", "dinosaur", "pie", 3.14};
        System.out.println(Arrays.toString(mixed));

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many favorite things do you have? ");
        int count = scanner.nextInt();
        scanner.nextLine();

        String[] favorites = new String[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Enter favorite thing #" + (i + 1) + ": ");
            favorites[i] = scanner.nextLine();
        }

        System.out.println("\nYour favorite things:");
        System.out.println(Arrays.toString(favorites));

        scanner.close();
    }
}
