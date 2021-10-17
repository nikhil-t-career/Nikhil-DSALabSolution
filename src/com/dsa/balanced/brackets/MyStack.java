package com.dsa.balanced.brackets;

/**
 * Stack Implementation for Balanced brackets
 * 
 * @author fullstack8
 *
 */
public class MyStack {
	int size;
	char arr[];
	int top;

	MyStack(int size) {
		this.size = size;
		this.arr = new char[size];
		this.top = -1;
	}

	public int peek() {
		if (!this.isEmpty())
			return arr[top];
		else {
			System.out.println("Stack is Empty!!");
			return -1;
		}
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (size - 1 == top);
	}

	public void push(char pushedElement) {
		if (!isFull()) {
			top++;
			arr[top] = pushedElement;
			System.out.println("Push :" + pushedElement);
		} else {
			System.out.println("Stack is full!!");
		}
	}

	public int pop() {
		if (!isEmpty()) {
			int returnedTop = top;
			top--;
			System.out.println("Pop :" + arr[returnedTop]);
			return arr[returnedTop];

		} else {
			System.out.println("Stack is empty!!");
			return -1;
		}
	}

}