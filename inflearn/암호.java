package p12;

import java.util.Scanner;

public class 암호 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		
		String answer="";
		String s = str.replace("#","1").replace("*","0");
		
		for(int i = 0; i < n; i++) {
			char x = (char)Integer.parseInt(s.substring(i*7,i*7+7),2);
			answer += (char)x;
		}
		System.out.print(answer);
	}

}
