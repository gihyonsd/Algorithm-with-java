import java.util.Scanner;

public class p2609 {
	/*public static int GCD(int a, int b) {
		while(b != 0) {
			int temp = a%b;
			a = b;
			b = temp;
		}
		return a;
	}*/ //반복문 유클리드 호재법
	public static int GCD(int a, int b) { //재귀 이용
		if(b==0) {
			return a;
		}
		return GCD(b, a%b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = GCD(a, b);
		System.out.println(c);
		System.out.println(a*b/c);
	}

}
