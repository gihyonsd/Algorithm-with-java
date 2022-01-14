import java.util.Scanner;

public class 문자열자르기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String answer = "";
		int m = Integer.MIN_VALUE;
		String[] s = str.split(" ");
		
		for(int i = 0; i<s.length; i++) {
			String x = s[i];
			int len = x.length();
			if(len > m) {
				m = len;
				answer = x;
			}
		}
		System.out.print(answer);

	}

}
