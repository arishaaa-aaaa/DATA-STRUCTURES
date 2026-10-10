import java.util.Scanner;

public class SelectionSortScenario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("--- Scenario: E-Commerce Product Prices Sorting (Selection Sort) ---");
        System.out.print("Enter number of products: ");
        int n = input.nextInt();
        
        double[] prices = new double[n];
        System.out.println("Enter the prices of the products:");
        for (int i = 0; i < n; i++) {
            prices[i] = input.nextDouble();
        }

        // Selection Sort Logic
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (prices[j] < prices[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            double temp = prices[minIndex];
            prices[minIndex] = prices[i];
            prices[i] = temp;
        }

        System.out.println("\nProduct Prices sorted from Lowest to Highest:");
        for (double price : prices) {
            System.out.print("$" + price + " ");
        }
        System.out.println();
        
        input.close();
    }
}