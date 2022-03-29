

import java.util.Arrays;
import java.util.Scanner;

public class p6996 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
		String str1 = sc.next();
		String str2 = sc.next();
		str1.toUpperCase();
		str2.toUpperCase();
		char[] sortStr1 = str1.toCharArray();
		char[] sortStr2 = str2.toCharArray();
		Arrays.sort(sortStr1);
		Arrays.sort(sortStr2);
		
		if(Arrays.equals(sortStr1, sortStr2)) {
			System.out.println(str1+" & "+str2+" are anagrams.");
		}
		else System.out.println(str1+" & "+str2+" are NOT anagrams.");
		}
	}

}