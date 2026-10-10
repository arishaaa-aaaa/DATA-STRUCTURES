import java.util.Scanner;

public class QueueLinkedList {

    // Node class to represent each element in the queue
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Front and rear pointers
    Node front, rear;

    // Constructor
    QueueLinkedList() {
        front = null;
        rear = null;
    }

    // Enqueue: Add element to the rear of the queue
    void enqueue(int value) {
        Node newNode = new Node(value);
        
        // If queue is empty, both front and rear point to new node
        if (rear == null) {
            front = rear = newNode;
            System.out.println(value + " added to queue.");
            return;
        }

        // Add the new node at the end and update rear
        rear.next = newNode;
        rear = newNode;
        System.out.println(value + " added to queue.");
    }

    // Dequeue: Remove element from the front of the queue
    void dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow! Queue is empty.");
            return;
        }

        System.out.println(front.data + " removed from queue.");
        front = front.next;

        // If front becomes null, then rear also needs to be set to null
        if (front == null) {
            rear = null;
        }
    }

    // Display queue elements
    void display() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue elements (Front to Rear): ");
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueLinkedList q = new QueueLinkedList();
        Scanner input = new Scanner(System.in);
        int choice, value;

        do {
            System.out.println("\n--- Queue (Linked List) Menu ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
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
                    System.out.println("Program ended.");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        input.close();
    }
}