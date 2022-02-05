package p32;

import java.util.*;


public class 공통원소구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr1 = new int[a];
		for(int i = 0; i < a; i++) {
			arr1[i] = sc.nextInt();
		}
		
		int b = sc.nextInt();
		int[] arr2 = new int[b];
		for(int i = 0; i < b; i++) {
			arr2[i] = sc.nextInt();
		}
		
		List<Integer> answer = new ArrayList<>();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					answer.add(arr1[i]);
					break;
				}
			}
		}
		
		for(Integer i : answer) {
			System.out.print(i+" ");
		}
	}

}
//fail
