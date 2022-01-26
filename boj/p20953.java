import java.util.ArrayList;
import java.util.Scanner;

public class p20953 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum = 0;
			
			for(int j = 0; j < a+b; j++) {
				for(int k = 0; k < j; k++) {
					sum++;
				}
			}
			sb.append(sum * (a+b)).append("\n");
		}
		System.out.print(sb.toString());;
		
	}

}
