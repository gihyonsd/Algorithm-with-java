import java.util.Scanner;

public class p2525{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = 0;
		if (b + c >= 60) {
			d = (b + c) / 60;
			a = a + d;
			if (a > 23) {
				a -= 24;
			}
			b = (b + c) % 60;
			System.out.println(a + " " + b);
		} else {
			b = b + c;
			System.out.println(a + " " + b);
		}
	}

}
