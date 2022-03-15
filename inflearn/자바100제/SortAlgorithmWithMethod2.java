package 자바100제;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortAlgorithmWithMethod2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] arr = new Integer[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("정렬 전 : ");
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("내림차순 정렬 후 : ");
		Arrays.sort(arr,Collections.reverseOrder());
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
