package p211;

import java.util.Scanner;

public class 임시반장정하기fix {
	public static int solution(int n, int[][] arr) {
		int answer = 0, max=Integer.MIN_VALUE;
		for(int i = 1; i <= n; i++) { //학생 번호
			int cnt = 0;
			for(int j = 1; j <= n; j++) { //i번 학생과 같은반을 했던 학생번호
				for(int k = 1; k <= 5; k++) { //k는 학년
					if(arr[i][k] == arr[j][k]) { //i번학생과 같은 반을한 j번학생이 몇명인가를 카운팅
						cnt++;
						break; 
					}
				}
			}
			if(cnt>max) {
				max = cnt; // 최댓값 구하기
				answer = i; //최댓값을 만드는 i번 학생이 답
			}
		}
		return answer; 
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n+1][6];
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.print(solution(n, arr));
	}

}
