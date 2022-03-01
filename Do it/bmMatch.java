package chap08;

import java.util.Scanner;

//보이어 무어 알고리즘으로 문자열을 검색
public class bmMatch {
	static int bmMatch(String txt, String pat) {
		int pt; //txt 커서
		int pp; //pat 커서
		int txtlen = txt.length(); //txt의 문자 개수
		int patlen = pat.length(); //pat의 문자 개수
		int[] skip = new int[Character.MAX_VALUE + 1]; //건너뛰기 표
		
		//건너뛰기 표 만들기
		for(pt = 0; pt <= Character.MAX_VALUE; pt++) {
			skip[pt] = patlen;
		}
		for(pt = 0; pt < patlen - 1; pt++) {
			skip[pat.charAt(pt)] = patlen - pt - 1; //pt==patlen - 1
		}
		
		//검색
		while(pt < txtlen) {
			pp = patlen - 1; //pat의 끝 문자에 주목
			
			while(txt.charAt(pt) == pat.charAt(pp)) {
				if(pp == 0) return pt; //검색 성공
				
				pp--;
				pt--;
			}
			pt += (skip[txt.charAt(pt)] > patlen - pp) ? skip[txt.charAt(pt)] : patlen - pp;
		}
		return -1; //검색 실패
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("텍스트 : ");
		String s1 = sc.next(); //텍스트용 문자열
		
		System.out.print("패턴 : ");
		String s2 = sc.next(); //패턴용 문자열
		
		int idx = bmMatch(s1, s2); //문자열 s1에서 문자열 s2를 검색
		
		if(idx == -1) {
			System.out.println("텍스트에 패턴이 없습니다.");
		}
		else {
			//일치하는 문자 바로 앞까지의 길이를 구합니다.
			int len = 0;
			for(int i = 0; i < idx; i++) {
				len += s1.substring(i, i + 1).getBytes().length;
			}
			len += s2.length();
			
			System.out.println((idx + 1) + "번째 문자부터 일치합니다.");
			System.out.println("텍스트 : " +s1);
			System.out.printf(String.format("패턴 : %%%ds\n", len), s2);
		}

	}

}
