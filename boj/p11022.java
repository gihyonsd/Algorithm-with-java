import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p11022 {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int a;
		int b;
		int c = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=c; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			System.out.println("Case #"+i+": "+a+" + "+b+" = "+(a+b));
		}
		br.close();
	}
}