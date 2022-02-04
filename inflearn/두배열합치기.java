package p31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 두배열합치기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		Integer[] arr1 = new Integer[a];
		for(int i = 0; i < a; i++) {
			arr1[i] = sc.nextInt();
		}
		List<Integer> list1 = new ArrayList(Arrays.asList(arr1));
		int b = sc.nextInt();
		Integer[] arr2 = new Integer[b];
		for(int i = 0; i < b; i++) {
			arr2[i] = sc.nextInt();
		}
		List<Integer> list2 = new ArrayList(Arrays.asList(arr2));
		list1.addAll(list2);
		Integer[] arrayadd = list1.toArray(new Integer[0]);
		
		Arrays.sort(arrayadd);
		for(int i = 0; i < arrayadd.length; i++) {
			System.out.print(arrayadd[i]+" ");
		}
		
	}

}
