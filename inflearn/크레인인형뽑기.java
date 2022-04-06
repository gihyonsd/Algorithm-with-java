package p53;

import java.util.Scanner;
import java.util.Stack;

public class 크레인인형뽑기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] board = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		int m = sc.nextInt();
		int[] moves = new int[m];
		for (int i = 0; i < m; i++) {
			moves[i] = sc.nextInt();
		}
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < moves.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[j][moves[i] - 1] != 0) {
					if (stack.isEmpty()) {
						stack.push(board[j][moves[i] - 1]);
					} else {
						if (stack.peek() == board[j][moves[i] - 1]) {
							stack.pop();
							answer += 2;
						} else {
							stack.push(board[j][moves[i] - 1]);
						}
					}
					board[j][moves[i] - 1] = 0;
					break;
				}
			}
		}
		System.out.println(answer);

	}

}
