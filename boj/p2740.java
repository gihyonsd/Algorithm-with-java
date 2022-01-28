

import java.util.Scanner;

public class p2740 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] arr = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		M = sc.nextInt();
		int K = sc.nextInt();
		int[][] arr2 = new int[M][K];
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < K; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		int[][] answer = new int[N][K];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < K; j++) {
				for(int k = 0; k < M; k++) {
					answer[i][j] += arr[i][k] * arr2[k][j];
				}
			}
		}
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < K; j++) {
				System.out.print(answer[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
