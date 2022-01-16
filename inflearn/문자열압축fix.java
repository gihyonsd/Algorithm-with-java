package p11;

import java.util.Scanner;

public class 문자열압축fix {
	public static String solution(String s) {
		String answer = "";
		s=s+" "; //빈 문자를 추가하는 이유는 s[i]와 s[i+1]을 비교할 때 마지막 문자에서 오류가 생기지않기 하기 위해서이다.
		int cnt = 1;
		
		for(int i = 0; i < s.length()-1; i++) { //빈 문자 전 까지만 for문
			if(s.charAt(i)==s.charAt(i+1)) {
				cnt++; 
			}
			else {
				answer += s.charAt(i); //answer에 i번째 문자 누적 저장
				if(cnt > 1) { //만약 cnt가 1보다 크다면
					answer += String.valueOf(cnt); //answer에 cnt 누적 저장
					cnt = 1;  // cnt 1로 초기화
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
		

	}

}
