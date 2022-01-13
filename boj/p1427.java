package boj;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class p1427 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		
		String[] arr = new String[n.length()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Character.toString(n.charAt(i));
		}
		Arrays.sort(arr, Collections.reverseOrder());
		for(int a = 0; a < arr.length; a++) {
			System.out.print(arr[a]);
		}
			
	}

}
