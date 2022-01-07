import java.util.Scanner;

public class p8393 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	
		int n = sc.nextInt();
		int sum = 0;
		sc.close();
		for(int i=0; i<=n; i++) {
			sum = i + sum;
			}
		System.out.println(sum);
	}

}