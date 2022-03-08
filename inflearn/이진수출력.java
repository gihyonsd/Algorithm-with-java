package p72;

import java.util.Scanner;

public class 이진수출력 {
	public static void DFS(int n) {
		if(n == 0) return;
		else {
			DFS(n / 2);
			System.out.print(n%2);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		DFS(n);
	}

}
