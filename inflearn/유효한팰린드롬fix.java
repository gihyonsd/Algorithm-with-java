package p8;

import java.util.Scanner;

public class 유효한팰린드롬fix {
	public static String solution(String s) {
		String answer = "NO";
		s = s.toUpperCase().replaceAll("[^A-Z]", ""); //대문자 A~Z까지가 아니면 ""빈 문자로
		String tmp = new StringBuilder(s).reverse().toString();
		if(s.equals(tmp)) answer = "YES";
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.print(solution(str));
	}

}
