package p10;

import java.util.Scanner;

public class 가장짧은문자거리 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char t = sc.next().charAt(0);
		int[] arr = new int[s.length()];
		
		int p = 100;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==t) {
				p=0;
				arr[i] = 0;
			}
			else {
				p++;
				arr[i] = p;
			}	
		}
		p = 100;
		for(int i = s.length()-1; i>=0; i--) {
			if(s.charAt(i) == t) {
				p=0;
			}
			else {
				p++;
				arr[i] = Math.min(arr[i], p);
			}
		}
		for(int i = 0; i < arr.length; i++) {
			int x = arr[i];
			System.out.print(x+" ");
		}
	}

}
