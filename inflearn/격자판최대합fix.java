package p29;

import java.util.Scanner;

public class 격자판최대합fix {
	public static int solution(int n, int[][] arr) {
		int answer = Integer.MIN_VALUE;
		int sum1, sum2; //행의 합, 열의 합
		for(int i = 0; i < n; i++) {
			sum1 = sum2 = 0;
			for(int j = 0; j < n; j++) {
				sum1 += arr[i][j]; //가로로 증가 순서대로 [행][열]
				sum2 += arr[j][i]; //세로로 증가
			}
			answer=Math.max(answer, sum1);
			answer=Math.max(answer, sum2); //둘 중의 큰 값을 answer로
		}
		sum1 = sum2 = 0; //대각선의 합
		for(int i = 0; i < n; i++) {
			sum1 += arr[i][i]; //좌상 우하대각선
			sum2 += arr[i][n-i-1]; //우상 좌하 대각선
		}
		answer = Math.max(answer, sum1);
		answer = Math.max(answer, sum2);
		
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i = 0; i < n; i++) { //2차원 배열 생성
			for(int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.print(solution(n,arr));
		
	}

}
