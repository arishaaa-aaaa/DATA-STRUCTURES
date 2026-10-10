import java.util.Scanner;

public class StackLinkedList {

    // Node class to represent each element in the linked list
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Top pointer of the stack
    Node top;

    // Constructor
    StackLinkedList() {
        top = null;
    }

    // Push: Add element to the top of the stack
    void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println(value + " pushed into stack.");
    }

    // Pop: Remove element from the top of the stack
    void pop() {
        if (top == null) {
            System.out.println("Stack Underflow! Stack is empty.");
        } else {
            System.out.println(top.data + " popped from stack.");
            top = top.next;
        }
    }

    // Peek: View the top element without removing it
    void peek() {
        if (top == null) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top element is: " + top.data);
        }
    }

    // Display stack elements
    void display() {
        if (top == null) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements (Top to Bottom): ");
            Node current = top;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        StackLinkedList s = new StackLinkedList();
        Scanner input = new Scanner(System.in);
        int choice, value;

        do {
            System.out.println("\n--- Stack (Linked List) Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    value = input.nextInt();
                    s.push(value);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.peek();
                    break;
                case 4:
                    s.display();
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