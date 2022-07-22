package com.bridgelab;

public class CreateAStack {
	public static void main(String[] args) {	
		StackOperations stack = new StackOperations();
		stack.push(70);
		stack.push(30);
		stack.push(56);

		stack.printStack();

		stack.peak();
		stack.pop();
        stack.pop();
        stack.pop();
        
        stack.printStack();
        
        System.out.println("\nNew Queue Created:");
        Queue queue1 = new Queue();
        queue1.enqueue(56);
        queue1.enqueue(30);
        queue1.enqueue(70);

        queue1.printQueue();



	}

}

