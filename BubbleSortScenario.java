import java.util.Scanner;

public class BubbleSortScenario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("--- Scenario: Student Exam Scores Sorting (Bubble Sort) ---");
        System.out.print("Enter number of students: ");
        int n = input.nextInt();
        
        int[] scores = new int[n];
        System.out.println("Enter the scores of " + n + " students:");
        for (int i = 0; i < n; i++) {
            scores[i] = input.nextInt();
        }

        // Bubble Sort Logic
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (scores[j] > scores[j + 1]) {
                    // Swap scores[j] and scores[j+1]
                    int temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped by inner loop, array is sorted
            if (!swapped) break;
        }

        System.out.println("\nScores sorted in ascending order (Lowest to Highest):");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
        
        input.close();
    }
}