package p28;

import java.util.Scanner;

public class 등수구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] rank = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			rank[i] = 1;
			for(int j = 0; j < n; j++) {
				if(arr[i]<arr[j]) {
					rank[i]++;
				}
			}
		}
		for(int i = 0; i < n; i++) {
			System.out.print(rank[i]+" ");
		}
	}

}
