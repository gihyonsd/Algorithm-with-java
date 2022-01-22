package p25;

import java.util.Scanner;

public class 에라토스테네스의체 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n+1];
		int answer = 0;
		for(int i = 2; i < n; i++) {
			if(a[i]==0) {
				answer++;
				for(int j=i; j<n; j+=i) {
					a[j] = 1;
				}
			}
		}
		System.out.print(answer);
	}

}
