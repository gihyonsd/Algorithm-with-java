package p65;

import java.util.Arrays;
import java.util.Scanner;

public class 중복확인 {
	public static String solution(int n, int[] arr) {
		Arrays.sort(arr);
		for(int i = 0; i < n-1; i++) {
			if(arr[i] == arr[i+1]) {
				return "D";
			}
		}
		return "U";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(solution(n, arr));
	}

}
