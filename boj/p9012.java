import java.util.Scanner;
import java.util.Stack;

public class p9012 {
	public static String solution(String s) {
		String answer = "YES";
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='(') {
				stack.push(s.charAt(i));
			} else if(s.charAt(i)==')') {
				if(stack.isEmpty()) {
					answer = "NO";
					break;
				}
				stack.pop();
			}
		}
		if(!stack.isEmpty()) {
			return "NO";
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			String str = sc.next();
			System.out.println(solution(str));
		}
		
	}

}

