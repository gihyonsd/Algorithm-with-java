package p8;

import java.util.Scanner;

public class 유효한팰린드롬 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.replaceAll("[^a-zA-Z]",""); //알파벳제외하고 다 삭제
		
		String reverse = new StringBuilder(str).reverse().toString();
		
		
		if(str.equalsIgnoreCase(reverse)) {
			System.out.print("YES");
		}
		else {
			System.out.print("NO");
		}
	}

}
