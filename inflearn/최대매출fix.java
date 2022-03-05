package p33;

import java.util.Scanner;

public class 최대매출fix {

	public static void main(String[] args) {
		int answer = 0, sum = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < k; i++) {
			sum += arr[i]; //k개의 숫자를 연속으로 더한 값 sum에 저장
		}
		answer = sum;
		for(int i = k; i < n; i++) {
			sum += (arr[i] - arr[i-k]);
			answer = Math.max(answer, sum); //둘 중 큰 값 리턴
		}
		System.out.print(answer);
	}

}
