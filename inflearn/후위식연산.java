package p54;

import java.util.Scanner;
import java.util.Stack;

public class 후위식연산 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Stack<Integer> stack = new Stack<>();
		int n1 = 0, n2 = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '+' || c == '-' || c == '/' || c == '*') {
				n2 = stack.pop();
				n1 = stack.pop();
				switch (c) {
				case '+':
					stack.push(n1 + n2);
					break;
				case '-':
					stack.push(n1 - n2);
					break;
				case '/':
					stack.push(n1 / n2);
					break;
				case '*':
					stack.push(n1 * n2);
					break;
				}
			} else {
				stack.push(c - '0'); //character to int 
			}
		}
		System.out.println(stack.pop());

	}

}
