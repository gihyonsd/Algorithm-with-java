import java.util.Scanner;
import java.util.Stack;

public class p11899 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Stack<Character> stack = new Stack<>();
		int cnt = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '(') {
				stack.push(str.charAt(i));
			}
			else {
				if(stack.isEmpty()) {
					cnt++;
				} else {
					stack.pop();
				}
			}
		}
		if(!stack.isEmpty()) {
			cnt += stack.size();
		}
		System.out.println(cnt);
	}

}
