package p6;

import java.util.Scanner;

public class 중복문자제거fix { //indexof는 제일 처음 발견된 문자의 인덱스번호를 리턴
	public static String solution(String str) {
		String answer="";
		for(int i = 0; i < str.length(); i++) {
			if(str.indexOf(str.charAt(i))==i) { //str의i번째 문자가 처음으로 발견되는 것하고 i와 같다면
				answer += str.charAt(i); //answer에 누적 저장
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(solution(str));

	}

}
