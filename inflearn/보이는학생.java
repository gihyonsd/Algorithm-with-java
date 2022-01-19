package p22;

import java.util.ArrayList;
import java.util.Scanner;

public class 보이는학생 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int count = 0;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			if(arr[i] > max) {
				count++;
				max = arr[i];
			}
		}
		System.out.print(count);
		
		
	}

}
