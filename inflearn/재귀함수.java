package p71;

import java.util.Scanner;

public class 재귀함수 {
	public static void Recursive(int n) {
		if(n==0) return;
		else {
			Recursive(n-1);
			System.out.print(n + " ");
		}
	}
	public static void answer(int n) {
		Recursive(n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		answer(n);
	}

}
