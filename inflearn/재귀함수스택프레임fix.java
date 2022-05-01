package p71;

import java.util.Scanner;

public class 재귀함수스택프레임fix {
	public static void DFS(int n) {
		if(n==0) return;
		else {
			DFS(n-1);
			System.out.print(n + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		DFS(n);
	}

}
