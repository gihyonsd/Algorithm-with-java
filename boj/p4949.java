import java.util.Scanner;
import java.util.Stack;

public class p4949 {
	public static String solution(String str) {
		String answer = "yes";
		Stack<Character> stack = new Stack<>();
		for (char x : str.toCharArray()) {
			if (x == '(' || x == '[')
				stack.push(x);
			else if (x == ')') {
				if (stack.isEmpty() || stack.peek() != '(') {
					return "no";
				} else {
					stack.pop();
				}
			} else if (x == ']') {
				if (stack.isEmpty() || stack.peek() != '[') {
					return "no";
				} else {
					stack.pop();
				}
			}
		}
		if (!stack.isEmpty())
			return "no";
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {

			String str = sc.nextLine();

			if (str.equals(".")) {
				break;
			}
			System.out.println(solution(str));
		}
	}

}
