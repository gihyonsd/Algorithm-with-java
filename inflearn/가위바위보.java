package p23;

import java.util.Scanner;

public class 가위바위보 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
		if(a[i]==1) {
			if(b[i]==2) {
				System.out.println("B");
			}
			else if(b[i]==3) {
				System.out.println("A");
			}
			else {
				System.out.println("D");
			}
		}
		else if(a[i]==2) {
			if(b[i]==1) {
				System.out.println("A");
			}
			else if(b[i]==3) {
				System.out.println("B");
			}
			else {
				System.out.println("D");
			}
		}
		else {
			if(b[i]==1) {
				System.out.println("B");
			}
			else if(b[i]==2) {
				System.out.println("A");
			}
			else {
				System.out.println("D");
			}
		  }
		}
	}

}
