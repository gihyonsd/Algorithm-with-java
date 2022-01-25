package p27;

import java.util.Scanner;

public class 점수계산 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int count = 0;
		int sum = 0;
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if(arr[i]==1) {
				count++;
			}
			else if(arr[i]==0) {
				count = 0;
			}
			sum += count;
			
		}
		System.out.print(sum);
	}

}
