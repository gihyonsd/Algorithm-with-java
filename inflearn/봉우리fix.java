package p210;

import java.util.Scanner;

public class 봉우리fix {
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1}; //미리 위치 초기화
	public static int solution(int n, int[][] arr) {
		int answer = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				boolean flag = true; //봉우리의 참 거짓 판별
				for(int k = 0; k < 4; k++) { //네방향 탐색
					int nx = i + dx[k]; //네방향을 보기위한 행 좌표
					int ny = j + dy[k]; //네방향을 보기위한 열 좌표
					if(nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny]>=arr[i][j]) { //nx ny의 값이 나 자신보다 크거다 같은게 하나라도 있다면 봉우리가 아님
						flag = false;
						break;
					}
						
				}
				if(flag) { //봉우리라면 ++
					answer++;
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.print(solution(n, arr));
	}

}
