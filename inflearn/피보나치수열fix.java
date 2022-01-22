package p24;

import java.util.Scanner;

public class 피보나치수열fix {
	public static void solution(int n) {
		int a = 1, b = 1, c;
		System.out.print(a+" "+b+" ");
		for(int i = 2; i < n; i++) {
			c = a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		} //배열 이용 x
		
		/*int[] answer = new int[n];
		answer[0] = 1;
		answer[1] = 1;
		for(int i = 2; i < n; i++) {
			answer[i] = answer[i-2]+answer[i-1]; //피보나치 수열 
		}*/ //배열을 이용
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		solution(n);
		//for(int x : solution(n)) System.out.print(x+ " ");
	}
}
