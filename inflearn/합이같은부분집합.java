package p81;

import java.util.Scanner;

public class 합이같은부분집합 {
	static int n, total = 0;
	static boolean flag = false;
	static String answer = "NO";
	static void DFS(int L, int sum, int[] arr) {
		if(flag) return;
		if((total/2) < sum) return;
		if(L==n) {
			if((total-sum)==sum) {
				answer = "YES";
				flag=true;
			}
		} else {
			DFS(L+1, sum+arr[L], arr);
			DFS(L+1, sum, arr);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			total += arr[i];
		}
		DFS(0,0,arr);
		System.out.println(answer);
	}

}
