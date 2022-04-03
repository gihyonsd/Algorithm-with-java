package p52;

import java.util.Scanner;
import java.util.Stack;

public class 괄호문자제거fix {
	public static String solution(String str) {
		String answer = "";
		Stack<Character> stack = new Stack<>();
		for(char x : str.toCharArray()) {
			if(x==')') {
				while(stack.pop() != '('); //꺼내고 '('가 아니면 계속 돌고 '('이면 break
				
			} else {
				stack.push(x);
			}
		}
		for(int i = 0; i < stack.size(); i++) {
			answer += stack.get(i);
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}

}
