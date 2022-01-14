package p5;

import java.util.*;

public class 특정문자뒤집기 {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String answer;
		String str = sc.next();
		char[] s = str.toCharArray();
		int lt = 0, rt = str.length() -1;
		
		while(lt<rt) {
			if(!Character.isAlphabetic(s[lt])) {
					lt++;
				}
			else if(!Character.isAlphabetic(s[rt])) {
					rt--;
				}
			else {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
				}
			}
			answer = String.valueOf(s);	
			System.out.print(answer);
	}
	
}
