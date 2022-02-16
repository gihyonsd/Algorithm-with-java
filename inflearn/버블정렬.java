package p62;

import java.util.Scanner;

public class 버블정렬 {
	static void swap(int[] a, int idx1, int idx2) {
		//a[idx1]와 a[idx2]의 값을 바꿉니다.
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	//버블 정렬
	static void bubbleSort(int[] a, int n) {
		for(int i = 0; i < n -1; i++) {
			for(int j = n - 1; j > i; j--) {
				if(a[j - 1] > a[j]) {
					swap(a, j - 1, j);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		bubbleSort(arr, n);
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
