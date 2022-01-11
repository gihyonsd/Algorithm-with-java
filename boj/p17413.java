import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class p17413 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		Stack<Character> st = new Stack<Character>();
		
		boolean flag = false;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '<') {
				flag = true;
				while(!st.isEmpty()) {
					System.out.print(st.pop());
				}
				System.out.print(str.charAt(i));
			}
			else if(str.charAt(i) == '>') {
				flag = false;
				System.out.print(str.charAt(i));
			}
			else if(flag) {
				System.out.print(str.charAt(i));
			}
			else if(!flag) {
				if(str.charAt(i) == ' ') {
					while(!st.isEmpty()) {
						System.out.print(st.pop());
					}
					System.out.print(str.charAt(i));
				}
				else {
					st.push(str.charAt(i));
				}
			}
		}
		while(!st.isEmpty()) {
			System.out.print(st.pop());
		}
	}

}
