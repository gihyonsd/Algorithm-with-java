package p26;

import java.util.Scanner;

public class 뒤집은소수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] a = new String[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.next();
		}
		for(int i = 0; i < n; i++) {
			int tmp = Integer.parseInt(new StringBuilder(a[i]).reverse().toString());
			boolean prime = true;
			if(tmp == 1) {
				prime = false;
			}
			for(int j = 2; j < tmp; j++) {
				if(tmp%j == 0) {
					prime = false;
				}
			}
			if(prime) {
				System.out.print(tmp+" ");
			}
		}
	}

}
