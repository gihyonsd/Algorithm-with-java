package p42;

import java.util.Arrays;
import java.util.Scanner;

public class 아나그램withArraySort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		str1.toUpperCase();
		str2.toUpperCase();
		char[] sortStr1 = str1.toCharArray();
		char[] sortStr2 = str2.toCharArray();
		Arrays.sort(sortStr1);
		Arrays.sort(sortStr2);
		
		if(Arrays.equals(sortStr1, sortStr2)) {
			System.out.print("YES");
		}
		else System.out.print("NO");
	}

}
