package p11;

import java.util.Scanner;

public class 문자열압축 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String answer = "";
		str += " ";
		int count = 1;
		
		for(int i = 0; i < str.length()-1; i++) {
			char a = str.charAt(i);
			char b = str.charAt(i+1);
			if(a==b) {
				count++;
			}
			else {
				answer += str.charAt(i);
				if(count>1) {
					answer += count;
					count = 1;
				}
			}
		}
		System.out.print(answer);
	}

}
