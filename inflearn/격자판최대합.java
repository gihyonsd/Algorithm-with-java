package p29;

import java.util.Scanner;

public class 격자판최대합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		int sum1=0, sum2=0, sum3=0, sum4=0;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int result = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++) {    //가로 세로 합 중 최댓값 result에 저장
			for(int j = 0; j < n; j++) {
				sum1 += arr[i][j];
				sum2 += arr[j][i];
			}
			result = Math.max(result, sum1);
			result = Math.max(result, sum2);
			sum1 = sum2 = 0;
		}
		for(int i = 0; i < n; i++) { //좌상 우하 대각선 합 중 최댓값 result에 저장
			sum3 += arr[i][i];
			result = Math.max(result, sum3);
			sum3 = 0;
		}
		for(int i = 0; i < n; i++) { //우상 좌하 대각선 합 중 최댓값 result에 저장
			int j = n;
			sum4 += arr[i][--j];
			result = Math.max(result, sum4);
			sum4 = 0;
		}
		System.out.print(result);
	}

}
