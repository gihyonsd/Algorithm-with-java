package chap05;

import java.util.Scanner;

public class Factorial {
	public static int factorial(int n) {
		if(n > 0) {
			return n * factorial(n-1);
		}
		else {
			return 1;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		
		int x = sc.nextInt();
		
		System.out.print(x + "의 팩토리얼은 " + factorial(x) + "입니다.");
	}

}
//재귀 호출은 메서드 자신을 호출하는 것이라고 이해하기보다는 자기 자신과 똑같은 메서들르 호출한다고 이해하는 것이 자연스럽다. 
//만약 진짜로 메서드 자신을 호출하면 끝없이 자기 자신을 호출하는 행위를 계속하기 때문이다.
