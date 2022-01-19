package p22;

import java.util.Scanner;

public class 보이는학생fix {
	public static int solution(int n, int[] arr) {
		int answer = 1, max = arr[0]; //첫번째 사람은 무조건 보임
		for(int i = 1; i < n; i++) { //두번째 사람부터
			if(arr[i] > max) {
				answer++;
				max = arr[i];
			}
		}
		return answer;
		
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
