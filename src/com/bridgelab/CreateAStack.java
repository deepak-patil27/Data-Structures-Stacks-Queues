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



	}

}

