package Practice3;

import java.util.Scanner;

public class 수크기비교2 {
	public static int max(int a, int b) {
		int result = 0;
		if(a > b) {
			result = a;
		}
		else {
			result = b;
		}
		return result;
	}
	public static int max(int a, int b, int c) {
		return max(max(a,b),c);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("3개의 숫자를 입력하세요 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int max1 = 0;
		int mid = 0, min = 0;
		max1 = max(a,b,c);
		if(max1 == a) {
			mid = max(b,c);
			if(mid == b) {
				min = c;
			}
			else {
				mid = c; min = b;
			}
		}
		if(max1 == b) {
			mid = max(a,c);
			if(mid == a) {
				min = c;
			}
			else {
				mid = c; min = a;
			}
		}
		if(max1 == c) {
			mid = max(a,b);
			if(mid == b) {
				min = a;
			}
			else {
				mid = a; min = b;
			}
		}
		System.out.println(max1+" "+mid+" "+min);

	}
}