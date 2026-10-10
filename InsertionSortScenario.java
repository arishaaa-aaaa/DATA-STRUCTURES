import java.util.Scanner;

public class InsertionSortScenario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("--- Scenario: Live Tournament Leaderboard (Insertion Sort) ---");
        System.out.print("Enter number of players: ");
        int n = input.nextInt();
        
        int[] leaderboard = new int[n];
        System.out.println("Enter the scores of players:");
        for (int i = 0; i < n; i++) {
            leaderboard[i] = input.nextInt();
        }

        // Insertion Sort Logic (Descending order for highest score at top)
        for (int i = 1; i < n; i++) {
            int key = leaderboard[i];
            int j = i - 1;

            // Shift elements of leaderboard[0..i-1] that are smaller than key
            // to one position ahead of their current position
            while (j >= 0 && leaderboard[j] < key) {
                leaderboard[j + 1] = leaderboard[j];
                j = j - 1;
            }
            leaderboard[j + 1] = key;
        }

        System.out.println("\nLeaderboard Sorted (Highest Score to Lowest):");
        for (int i = 0; i < n; i++) {
            System.out.println("Rank " + (i + 1) + ": " + leaderboard[i] + " points");
        }
        
        input.close();
    }
}