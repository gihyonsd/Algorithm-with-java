package p76;

import java.util.Scanner;

public class 부분집합구하기 {
	static int n;
	static int[] ch;

	public static void DFS(int L) {
		if (L == n + 1) {
			String tmp = "";
			for (int i = 1; i <= n; i++) {
				if (ch[i] == 1) {
					tmp += (i + " ");
				}
			}
			if(tmp.length() > 0) {
				System.out.println(tmp);
			}
		} else {
			ch[L] = 1;
			DFS(L + 1); // 왼쪽 사용 O
			ch[L] = 0;
			DFS(L + 1); // 오른쪽 사용 x
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		ch = new int[n + 1];
		DFS(1);
	}

}
