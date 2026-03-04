import java.util.Arrays;
import java.util.Objects;

public class PAArrays {
    public static void main (String[] args) {

        int[] integerArray = {1, 2, 3};
        int[] intArray = {13, 5, 7, 68, 2};

        System.out.println(Arrays.toString(integerArray));
        System.out.println(getMiddle(intArray));

        String[] colors = new String[4];
        stringArray(colors);
        System.out.println(colors.length);
        String[] colorCopy = colors.clone();
        System.out.println(Arrays.toString(colorCopy));

        int[] randoFive = new int[5];
        newArray(randoFive);
        System.out.println(randoFive[0] + ", " + randoFive[randoFive.length-1]);
//        System.out.println(randoFive[randoFive.length]);
//        randoFive[5] = 210;

        indexArray(randoFive);
        System.out.println(Arrays.toString(randoFive));

        indexArrayX2(randoFive);
        System.out.println(Arrays.toString(randoFive));

        notTheMiddle(randoFive);

        String[] swap = {"one", "two", "three", "four", "five"};
        swapArray(swap);
        System.out.println(Arrays.toString(swap));

        int[] sort = {4, 2, 9, 13, 1, 0};
        Arrays.sort(sort);
        System.out.println("Array in ascending order: " + Arrays.toString(sort));
        System.out.println("The smallest number: " + Arrays.toString(new int[]{sort[0]}));
        System.out.println("The largest number: " + Arrays.toString(new int[]{sort[sort.length-1]}));
    }

    public static int getMiddle (int[] arr) {
        return arr[arr.length / 2];
    }

    public static void stringArray (String[] arr) {
        arr[0] = "red";
        arr[1] = "green";
        arr[2] = "blue";
        arr[3] = "yellow";
    }

    public static void newArray (int[] arr) {
        arr[0] = 123;
        arr[1] = 456;
        arr[2] = 789;
        arr[3] = 876;
        arr[4] = 543;
    }

    public static void indexArray (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }

    public static void indexArrayX2 (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
        }
    }

    public static void notTheMiddle (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i != 2){
                System.out.println(arr[i]);
            }
        }
    }

    public static void swapArray (String[] arr) {
        String first = arr[0];
        String middle = arr[2];
        arr[0] = middle;
        arr[2] = first;
    }
}
