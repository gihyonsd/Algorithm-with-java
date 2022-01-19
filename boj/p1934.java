import java.util.Scanner;

public class p1934 {
	
	public static int gcd(int x, int y) {
		if(y==0) {
			return x;
		}
		else {
			return gcd(y,x%y);
		}
	} //유클리드 호재법 외우기

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int d = gcd(a, b);
			System.out.println(a*b/d);
		}
	}

}
