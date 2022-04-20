import java.util.Scanner;

public class p13241 {
	public static long gcd(long a, long b) {
		while(b > 0) {
			long tmp = a;
			a = b;
			b = tmp % b;
		}
		return a;
	}
	public static long max(long a, long b) {
		return (a * b) / gcd(a,b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		System.out.println(max(n,m));
	}

}
