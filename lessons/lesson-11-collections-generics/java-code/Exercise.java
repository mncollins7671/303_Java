import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// EXERCISE: Score Processor (SBA-style Array ↔ List manipulation)
//
// Given an int[] of test scores:
// 1. Convert to ArrayList<Integer>
// 2. Remove all scores below 60 (failing)
// 3. Add a 5-point curve to each remaining score (cap at 100)
// 4. Convert back to int[]
// 5. Print the result

public class Exercise {
    public static void main(String[] args) {

        int[] scores = {85, 42, 95, 58, 73, 91, 37, 88, 65, 100};
        System.out.println("Original: " + Arrays.toString(scores));

        // TODO Step 1: Convert to ArrayList<Integer>

        ArrayList<Integer> scoresList = new ArrayList<>();
        for (int s : scores) scoresList.add(s);

        // TODO Step 2: Remove scores below 60
        // HINT: loop backward when removing!

        for (int i = scoresList.size() - 1; i >= 0; i--){
            if (scoresList.get(i) < 60) {
                scoresList.remove(i);
            }
        }
        System.out.println("Scores above 60: " + scoresList);

        // TODO Step 3: Add 5-point curve (cap at 100)
        // HINT: use Math.min(score + 5, 100)

        for (int i = 0; i < scoresList.size(); i++){
                scoresList.set(i, Math.min(scoresList.get(i) +5, 100));
        }

        System.out.println("After curve: " + scoresList);

        // TODO Step 4: Convert back to int[]

        int[] passing = new int[scoresList.size()];
        for (int i = 0; i <scoresList.size(); i++){
            passing[i] = scoresList.get(i);
        }

        // TODO Step 5: Print result
         System.out.println("Final: " + Arrays.toString(passing));
    }
}
