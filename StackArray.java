import java.util.Scanner;

class Stack {

    // Maximum size of stack
    static final int MAX = 10;

    // Array to store stack elements
    int[] stack;

    // Top of stack
    int top;

    // Constructor
    Stack() {
        stack = new int[MAX];
        top = -1;
    }

    // Push: Add element to stack
    void push(int value) {

        if (isFull()) {
            System.out.println("Stack Overflow! Stack is full.");
        } 
        else {
            top++;
            stack[top] = value;

            System.out.println(value + " pushed into stack.");
        }
    }

    // Pop: Remove element from stack
    void pop() {

        if (isEmpty()) {
            System.out.println("Stack Underflow! Stack is empty.");
        } 
        else {
            System.out.println(stack[top] + " popped from stack.");
            top--;
        }
    }

    // Peek: Show top element
    void peek() {

        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } 
        else {
            System.out.println("Top element = " + stack[top]);
        }
    }

    // Display stack
    void display() {

        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } 
        else {
            System.out.println("Stack elements:");

            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }

            System.out.println();
        }
    }

    // Check if stack is empty
    boolean isEmpty() {
        return top == -1;
    }

    // Check if stack is full
    boolean isFull() {
        return top == MAX - 1;
    }

    // Find size of stack
    int size() {
        return top + 1;
    }
}


public class StackArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Stack s = new Stack();

        int choice;
        int value;

        do {

            System.out.println("\n===== STACK MENU =====");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Size");
            System.out.println("6. Is Empty");
            System.out.println("7. Is Full");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
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
                    System.out.println("Stack size = " + s.size());
                    break;

                case 6:
                    if (s.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } 
                    else {
                        System.out.println("Stack is not empty.");
                    }
                    break;

                case 7:
                    if (s.isFull()) {
                        System.out.println("Stack is full.");
                    } 
                    else {
                        System.out.println("Stack is not full.");
                    }
                    break;

                case 8:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 8);

        input.close();
    }
}