import java.util.ArrayList;
import java.util.Scanner;

public class p11653 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 2; i <= n; i++) {
			while(n%i==0) {
				list.add(i);
				n=n/i;
			}
		}
		for(int x : list) {
			System.out.println(x);
		}
	}

}
