package ArrayPractice;

import java.util.*;

class Array {
	private int a = 0;
	private int b = 0;
	private int height = 0;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}


	void show(int a, int b, int height) {
		System.out.printf("객체 한변의 길이 : %d%n" + "다른변의 길이 : %d%n" + "높이 : %d%n" + "용적 : %d%n", a, b, height, a*b*height);
	}

}

public class Arrprac {

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
		int a = 0, b = 0, c = 0;
		Array a1 = new Array();
		for (int i = 0; i < arr.length; i++) {
			a = arr[i][0] + 1;
			b = arr[i][1] + 1;
			c = arr[i][2] + 1;
			a1.show(a, b, c);

		}

	}

}
