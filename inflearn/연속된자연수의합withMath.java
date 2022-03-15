package p35_2;

import java.util.Scanner;

public class 연속된자연수의합withMath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0, cnt = 1;
		n--;
		while(n>0) {
			cnt++;
			n = n - cnt;
			if(n%cnt == 0) answer++;
		}
		System.out.print(answer);
	}

}
