import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class p9093 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Stack<Character> st = new Stack<Character>();
		
		for(int i = 0; i < n; i++) {
			String str = br.readLine()+"\n";
			StringBuilder sb = new StringBuilder();
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == ' ' || str.charAt(j) == '\n') {
					while(!st.isEmpty()) {
						sb.append(st.peek());
						st.pop();
					}
					if(str.charAt(j) == ' ') {
						sb.append(str.charAt(j));
					}
				}else {
						st.push(str.charAt(j));
					}
				}
			bw.write(sb.toString()+"\n");
			}
		
		br.close();
		bw.flush();
		bw.close();
		}

	}

