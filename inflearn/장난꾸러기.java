package p66;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 장난꾸러기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] tmp = arr.clone();
		Arrays.sort(tmp);
		ArrayList <Integer> answer = new ArrayList(); 
		for(int i = 0; i < n; i++) {
			if(arr[i] != tmp[i]) {
				answer.add(i+1);
			}
		}
		for(int x : answer) {
			System.out.print(x+" ");
		}
	
	}

}
