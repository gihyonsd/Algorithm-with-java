package 자바100제;

import java.util.Arrays;
import java.util.Scanner;

public class SortAlgorithmWithMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n]; //점수 배열
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("정렬 전");
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		Arrays.sort(arr);
		System.out.println("정렬 후");
		for(int i : arr) {
			System.out.print(i+" ");
		}
		
	}

}
