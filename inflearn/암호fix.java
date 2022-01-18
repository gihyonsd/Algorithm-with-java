package p12;

import java.util.Scanner;

public class 암호fix {
	public static String solution(int n, String s) {
		String answer="";
		for(int i = 0; i < n; i++) {
			String tmp = s.substring(0,7).replace('#', '1').replace('*', '0'); //0,7까지 나누고 2진수 형태로 바꿔줌
			int num = Integer.parseInt(tmp, 2); //2진수 tmp string을 10진수화
			answer += (char)num; //문자로 변경
			s = s.substring(7); //s의 substring 7번째 이후로 바꿈
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		System.out.print(solution(n,str));
	}

}
