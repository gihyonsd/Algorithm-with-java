import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class p9093timeover {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack<Character> st = new Stack<Character>();
		
		for(int i = 0; i < n; i++) {
			String str = br.readLine()+'\n';
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == ' ' || str.charAt(j) == '\n') {
					while(!st.isEmpty()) {
						System.out.print(st.pop());
					}
					if(str.charAt(j) == ' ') {
						System.out.print(" ");
					}
				}else {
						st.push(str.charAt(j));
					}
				}
			}
		}

	}