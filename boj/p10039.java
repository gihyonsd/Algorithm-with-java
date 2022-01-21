import java.util.Scanner;

public class p10039 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 5;
		int sum = 0;
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if(a[i]<40) {
				a[i] = 40;
			}
			sum += a[i];
		}
		System.out.print(sum/n);
	}

}
