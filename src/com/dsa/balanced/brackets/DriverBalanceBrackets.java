package com.dsa.balanced.brackets;

/**
 * Driver class to check if String Expression is Bracket balanced
 * 
 * @author fullstack8
 *
 */
public class DriverBalanceBrackets {

	public static void main(String[] args) {

		String expr = "(([{[]}]))";

		// Function call
		if (checkBracketsBalanced(expr))
			System.out.println("Expression is Bracket Balanced!!!");
		else
			System.out.println("Expression is Not Balanced!!!");
	}

	static boolean checkBracketsBalanced(String exp) {

		// Using Custom made Stack class
		MyStack stack = new MyStack(20);

		// Traversing the Expression
		for (int i = 0; i < exp.length(); i++) {
			char x = exp.charAt(i);

			if (x == '(' || x == '[' || x == '{') {
				// Push in stack
				stack.push(x);
				continue;
			}

			// If current character is not opening
			// bracket, then it must be closing. So stack
			// cannot be empty at this point.
			if (stack.isEmpty())
				return false;

			int check;

			switch (x) {
			case ')':
				check = stack.pop();
				if (check == '{' || check == '[')
					return false;
				break;

			case '}':
				check = stack.pop();
				if (check == '(' || check == '[')
					return false;
				break;

			case ']':
				check = stack.pop();
				if (check == '(' || check == '{')
					return false;
				break;
			}
		}

		// Check for Empty Stack
		return (stack.isEmpty());
	}

}