import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("--- Basic Array Operations ---");
        System.out.print("Enter maximum capacity of the array: ");
        int capacity = input.nextInt();
        
        int[] arr = new int[capacity];
        int n = 0; // current number of elements
        int choice;

        do {
            System.out.println("\n--- Array Menu ---");
            System.out.println("1. Insert Element");
            System.out.println("2. Display Elements");
            System.out.println("3. Search Element");
            System.out.println("4. Delete Element");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1: // Insert
                    if (n >= capacity) {
                        System.out.println("Array is full! Cannot insert more elements.");
                    } else {
                        System.out.print("Enter value to insert: ");
                        int val = input.nextInt();
                        arr[n] = val;
                        n++;
                        System.out.println(val + " inserted successfully.");
                    }
                    break;

                case 2: // Display
                    if (n == 0) {
                        System.out.println("Array is empty.");
                    } else {
                        System.out.print("Array elements: ");
                        for (int i = 0; i < n; i++) {
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3: // Search
                    if (n == 0) {
                        System.out.println("Array is empty.");
                    } else {
                        System.out.print("Enter value to search: ");
                        int target = input.nextInt();
                        boolean found = false;
                        for (int i = 0; i < n; i++) {
                            if (arr[i] == target) {
                                System.out.println("Element " + target + " found at index " + i + ".");
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Element not found in the array.");
                        }
                    }
                    break;

                case 4: // Delete by index
                    if (n == 0) {
                        System.out.println("Array is empty.");
                    } else {
                        System.out.print("Enter index to delete (0 to " + (n - 1) + "): ");
                        int idx = input.nextInt();
                        if (idx < 0 || idx >= n) {
                            System.out.println("Invalid index!");
                        } else {
                            int deletedVal = arr[idx];
                            // Shift elements to the left
                            for (int i = idx; i < n - 1; i++) {
                                arr[i] = arr[i + 1];
                            }
                            n--;
                            System.out.println("Element " + deletedVal + " deleted successfully.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        input.close();
    }
}