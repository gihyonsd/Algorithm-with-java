package p5;

import java.util.Scanner;

public class 특정문자뒤집기fix {
	public static String solution(String str) {
		String answer;
		char[] s = str.toCharArray();
		int lt = 0, rt = str.length()-1;
		while(lt < rt) {
			if(!Character.isAlphabetic(s[lt])) { //s[lt]가 알파벳이 아닐때 (특수문자일때)
				lt++;
			}
			else if(!Character.isAlphabetic(s[rt])) { //s[rt]가 알파벳이 아닐때(특수문자일떄)
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
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));

	}

}
