package p63;

import java.util.Scanner;

public class 삽입정렬 {
	static void insertionSort(int[] arr, int n) {
		for(int i = 1; i < n; i++) {
			int j;
			int tmp = arr[i];
			for(j = i; j > 0 && arr[j - 1] > tmp; j--) {
				arr[j] = arr[j - 1];
			}
			arr[j] = tmp;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		insertionSort(arr, n);
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
