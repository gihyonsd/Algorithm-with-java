

import java.util.Scanner;

public class p2747 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 = 0, n2 = 1;
		int n3 = 1;
		
		for(int i = 0; i < n; i++) {
			n3 = n1+n2; 
			n1 = n2; 
			n2 = n3; 
		}
		System.out.print(n1);
	}


}