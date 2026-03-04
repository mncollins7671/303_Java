// EXERCISE: Grade Manager
// Given a grades array:
// 1. Calculate the class average
// 2. Print all grades above the average
// 3. Write a method to replace a grade at a given index (with validation!)

public class Exercise {
    public static void main(String[] args) {

        double[] grades = {88.5, 72.0, 95.5, 64.0, 81.0, 90.0, 77.5, 85.0};

        // TODO 1: Calculate average

        int gradeCount = 0;
        double scoreTotal = 0.0;

        for (double score : grades) {
            gradeCount++;
            scoreTotal = scoreTotal + score;
        }

        double average = scoreTotal / gradeCount;

        // TODO 2: Print all grades above average
        // System.out.println("Grades above average:");

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > average) {
                System.out.println(grades[i]);
            }
        }

        // TODO 3: Replace grade at index 2 with 100.0 (valid)
        ExerciseSolution.replaceGrade(grades, 2, 100.0);

        // TODO 3b: Try replacing at index 20 (invalid — should print error)
        ExerciseSolution.replaceGrade(grades, 20, 100.0);
    }

    // TODO: Write this method
    public static void replaceGrade(double[] grades, int index, double newGrade) {
        // Validate index first! (guard clause)
        if (index < 0 || index >= grades.length) {
            System.out.println("Error: " + index + " not found.");
        }
        // Then replace
        grades[index] = newGrade;
    }
}
