import java.util.Scanner;

public class p2798 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		int result = 0;
		for(int i = 0; i < n-2; i++) {
			for(int j = i+1; j < n-1; j++) {
				for(int k = j+1; k < n; k++) {
					sum = arr[i] + arr[j] + arr[k];
					if(sum <= m) {
						result = Math.max(result, sum);
					}
					if(sum == m) {
						System.out.println(result);
						return;
					}
				}
			}
		}
		System.out.println(result);
	}
}
