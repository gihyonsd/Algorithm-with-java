package p34;

import java.util.Scanner;

public class 연속부분수열fix {
	public static int solution(int n, int m, int[] arr) {
		int answer = 0, sum = 0, lt = 0;
		for(int rt = 0; rt < n; rt++) {//1. rt가 증가하고
			sum += arr[rt]; //2. sum에 rt값을 더하고 
			if(sum == m) answer++; //3. m과 같은지 바로 확인 이 시점에선 sum이 lt부터 rt까지의 합을 의미
			while(sum >= m) {
				sum -= arr[lt++]; //sum = sum - arr[lt++] (빼고 난 후 증가)
				if(sum == m) answer++;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(solution(n,m,arr));
		
	}

}
