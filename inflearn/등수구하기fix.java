package p28;

import java.util.Scanner;

public class 등수구하기fix {
	public static int[] solution(int n, int[] arr) {
		int[] answer = new int[n];
		for(int i = 0; i < n; i++) {
			int cnt = 1; //등수는 처음에는 1등으로 전부 초기화
			for(int j = 0; j < n; j++) {
				if(arr[j]>arr[i]) {
					cnt++; //arr[j]가 돌면서 arr[i]보다 큰 수가 있다면 등수 증가
				}
				answer[i] = cnt; 
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
		for(int x : solution(n,arr)) {
			System.out.print(x+" ");
		}
	}

}
