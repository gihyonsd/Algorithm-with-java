package chap05;

import java.util.Scanner;

public class Recur {
	static void recur(int n) {
		if(n > 0) {
			recur(n-1);
			System.out.println(n);
			recur(n-2);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 :");
		int x = sc.nextInt();
		
		recur(x);
	}

}
//상향식 분석과 하향식 분석 이해하기