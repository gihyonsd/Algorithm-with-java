package p35;

import java.util.Scanner;

public class 연속된자연수의합fix {
	public static int solution(int n, int[] arr) {
		int answer = 0, sum = 0, lt = 0;
		int m = n/2+1;
		for(int rt = 0; rt < m; rt++) {
			sum += arr[rt];
			if(sum == n) answer++;
			while(sum >= n) {
				sum -= arr[lt++];
				if(sum == n) answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n+2/1];
		for(int i = 0; i < n+2/1; i++) {
			arr[i] = i+1;
		}
		System.out.print(solution(n, arr));
	}

}
