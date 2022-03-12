package 자바100제;

import java.util.Scanner;

public class 최댓값구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int max = arr[0];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if(max < arr[i]) max = arr[i];
		}
		System.out.print("현재 배열 내 가장 큰 값은 : " +max);
	}

}
