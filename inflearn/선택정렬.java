package p61;

import java.util.Scanner;

public class 선택정렬 {
	static void swap(int[] a, int idx1, int idx2) {
		//a[idx1]와 a[idx2]의 값을 바꿉니다.
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	static void selectionSort(int[] a, int n) {
		for(int i = 0; i < n - 1; i++) {
			int min = i;
			for(int j = i + 1; j < n; j++) {
				if(a[j] < a[min]) {
					min = j;
				}
			}
			swap(a, i, min);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		selectionSort(arr, n);
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
