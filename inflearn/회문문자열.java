package p7;

import java.util.Scanner;

public class 회문문자열 {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String s = new StringBuilder(str).reverse().toString();
		
		
		if(str.equalsIgnoreCase(s)) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}
