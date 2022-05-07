package 자바100제;

import java.util.*;

public class ArrayPrc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> List = new ArrayList<>();
		int n;
		while ((n = sc.nextInt()) >= 0) {
			List.add(n);
		}
		System.out.println("입력된 Data의 갯수 : " + List.size());
		int m;
		if (List.size() % 3 == 0) {
			m = List.size() / 3;
		} else {
			m = List.size() / 3 + 1;
		}
		int[][] arr = new int[m][3];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < 3; j++) {
				if (List.size() > i * 3 + j) {
					arr[i][j] = List.get(i * 3 + j);
				} else {
					break;
				}
			}
		}
		for (int i = 0; i < m; i++) {
			int mul = 1;
			for (int j = 0; j < 3; j++) {
				mul *= arr[i][j];
				System.out.println("육면체 한변의 길이 : " + arr[i][j]);
			}
			System.out.println("용적은 : " + mul);
		}

	}

}