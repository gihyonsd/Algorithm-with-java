package 자바100제;

import java.util.Scanner;

public class Rankalgorithm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] score = new int[n];
		int count;
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < arr.length; i++) {
			count = 1;
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] < arr[j])
					count++;
			}
			score[i] = count;
		}
		for(int i = 0; i < n; i++) {
			System.out.print(" "+arr[i]+"점--> "+score[i]+"등" );
		}
		
	}

}
