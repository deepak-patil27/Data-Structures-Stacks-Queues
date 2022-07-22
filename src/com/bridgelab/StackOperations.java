package com.bridgelab;

public class StackOperations {
	static Node top;
    
    public Node push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
            return top;
        }
        newNode.next = top;
        top = newNode;
        return top;
    }
    
    
    public void pop () {
        System.out.println("\nPopped element is: " + top.data);
        top = top.next;
    }


    public void peak() {
        if (top != null) {
            System.out.println("\nTop of the stack is: " + top.data);
        } else {
            System.out.println("No element left in the stack.");
        }
    }

    
    public void printStack() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return;
        }
        Node pointer = top;
        while (pointer != null) {
            System.out.print(pointer.data + " ");

            pointer = pointer.next;
        }

    }

}
