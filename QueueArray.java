import java.util.Scanner;

public class QueueArray {
    // Maximum size of queue
    static final int MAX = 10;
    
    // Array to store queue elements
    int[] queue = new int[MAX];
    int front;
    int rear;

    // Constructor
    QueueArray() {
        queue = new int[MAX];
        front = 0;
        rear = -1;
    }

    // Enqueue: Add element
    void enqueue(int value) {
        if (rear >= MAX - 1) {
            System.out.println("Queue Overflow! Queue is full.");
        } else {
            rear++;
            queue[rear] = value;
            System.out.println(value + " added to queue.");
        }
    }

    // Dequeue: Remove element
    void dequeue() {
        if (front > rear || front == MAX) {
            System.out.println("Queue Underflow! Queue is empty.");
        } else {
            System.out.println(queue[front] + " removed from queue.");
            front++;
        }
    }

    // Display queue elements
    void display() {
        if (front > rear || front == MAX) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    // Check if empty
    boolean isEmpty() {
        return (front > rear || front == MAX);
    }

    // Check if full
    boolean isFull() {
        return (rear >= MAX - 1);
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray();
        Scanner input = new Scanner(System.in);
        int choice, value;

        do {
            System.out.println("\n--- Queue Menu ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Check if Empty");
            System.out.println("5. Check if Full");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    value = input.nextInt();
                    q.enqueue(value);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    if (q.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Queue is not empty.");
                    }
                    break;
                case 5:
                    if (q.isFull()) {
                        System.out.println("Queue is full.");
                    } else {
                        System.out.println("Queue is not full.");
                    }
                    break;
                case 6:
                    System.out.println("Program ended.");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 6);

        input.close();
    }
}