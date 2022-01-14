package p4;

import java.util.Scanner;

public class 단어뒤집기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			String str = sc.next();
			String reversed = new StringBuffer(str).reverse().toString();
			System.out.println(reversed);
		}
	}

}
