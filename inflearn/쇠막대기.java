package p55;

import java.util.Scanner;
import java.util.Stack;

public class 쇠막대기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '(') {
				stack.push(str.charAt(i));
			}
			else if(str.charAt(i) == ')') {
				stack.pop();
				if(str.charAt(i-1)=='(') {
					answer += stack.size();
				}
				else {
					answer += 1;
				}
			}
			else {
				answer = answer + 1;
			}
			
		}
		System.out.println(answer);
	}

}
