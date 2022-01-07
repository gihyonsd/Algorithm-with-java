import java.util.Scanner;
import java.util.StringTokenizer;

public class p10953 {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			str = sc.next();
			StringTokenizer st = new StringTokenizer(str,",");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			System.out.println(a+b);
			
		}
		
    }
}