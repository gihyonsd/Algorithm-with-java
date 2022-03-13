package 자바100제;

import java.util.Scanner;

public class 최솟값구하기 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int[] arr = new int[n];
		 int min = arr[0];
		 for(int i = 0; i < n; i++) {
			 arr[i] = sc.nextInt();
			 if(min > arr[i]) {
				 min = arr[i];
			 }
		 }
		 System.out.print(min);
	}

}
