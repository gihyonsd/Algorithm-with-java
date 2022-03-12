package p74;

import java.util.Scanner;

public class Recursive피보나치 {
	 public static int DFS(int n) {
		 if(n==0) return 0;
		 if(n==1) return 1;
		 else return DFS(n-1) + DFS(n-2);
	 }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.print(DFS(i)+" ");
		}
	}

}
