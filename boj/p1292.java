import java.util.ArrayList;
import java.util.Scanner;

public class p1292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		int count = 1;
		
		for(int i = 0; i < b; i++) {
			for(int j = 0; j < count; j++) {
				list.add(count);
			}
			count++;
		}
		for(int i = a; i <= b; i++) {
			sum = list.get(i-1) + sum;
		}
		System.out.print(sum);
	}

}
