import java.util.Scanner;

public class p1712 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(c<=b) {
			System.out.print("-1");
		}
		else {
			System.out.print(a/(c-b)+1);
		}
	}

}
