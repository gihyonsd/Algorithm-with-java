package p52;

import java.util.Scanner;
import java.util.Stack;

public class 괄호문자제거 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Stack<Character> stack = new Stack<>();
		String answer = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '(') {
				stack.push(str.charAt(i));
			}else if(str.charAt(i) == ')') {
				stack.pop();
			}
			else {
				if(stack.isEmpty()) {
					answer += str.charAt(i);
				}
			}
		}
		System.out.print(answer);
		
	}

}
