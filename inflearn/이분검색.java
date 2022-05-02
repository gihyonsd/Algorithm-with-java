package p68;

import java.util.Arrays;
import java.util.Scanner;

public class 이분검색 {
	public static int binarySearch(int m, int[] arr) {
		int answer = 0;
		Arrays.sort(arr);
		int mid;
		int left = 0;
		int right = arr.length - 1;
		while(left <= right) {
			mid = (right + left) / 2;
			
			if(arr[mid] == m) {
				return mid+1;
			}
			if(m < arr[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(binarySearch(m,arr));
		
	}

}
