package p51;

import java.util.Scanner;
import java.util.Stack;

public class 올바른괄호 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Stack<Character> stack = new Stack<>();
		String answer ="YES";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '(') {
				stack.push(str.charAt(i));
			} else if(str.charAt(i) == ')') {
				if(stack.isEmpty()) {
					answer = "NO"; 
					break;
				}
				stack.pop();
			}
		}
		if(!stack.isEmpty()) answer="NO";
		System.out.println(answer);
		
	}

}
