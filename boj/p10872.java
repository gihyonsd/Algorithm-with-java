import java.util.Scanner;

public class p10872 {
	public static int factorial(int n) {
		if(n>0) {
			return n* factorial(n-1);
		}
		else {
			return 1;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.print(factorial(n));
	}

}
