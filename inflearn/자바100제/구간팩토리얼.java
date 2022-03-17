package practice;

import java.util.Scanner;

public class 구간팩토리얼 { 
	static int factorial(int x, int y) {
		int r = 1;
		while(x<=y) {
			r = r * y;
			y--;
		}
		return r;
	}
	static int factorial(int y) {
		int r = 1;
		while(y > 0) {
			r = r * y;
			y--;
		}
		return r;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(factorial(x,y));
		System.out.println(factorial(y));
	}

}
