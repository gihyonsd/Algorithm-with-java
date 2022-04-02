package p45;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class k번째큰수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
		for(int i = 0; i < n-2; i++) {
			for(int j = i+1; j < n-1; j++) {
				for(int l = j+1; l < n; l++) {
					Tset.add(arr[i]+arr[j]+arr[l]);
				}
			}
		}
		int cnt = 0;
		int answer = -1;
		for(int x : Tset) {
			cnt++;
			if(cnt == k) answer = x; 
		}
		System.out.print(answer);
	}

}
