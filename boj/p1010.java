import java.util.Scanner;

public class p1010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int t=n;
		
		while(true) {
			n = ((n%10)*10) + (((n/10)+(n%10))%10);
			count++;
			if(n==t) break;
		}
		System.out.println(count);
		sc.close();
		

	}

}