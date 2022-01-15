package p7;

import java.util.Scanner;

public class 회문문자열fix {
	public static String solution(String str) {
		String answer = "No";
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(tmp)) answer = "YES";
		
		/*String answer = "YES";
		str = str.toUpperCase(); //대소문자 구분을 하지 않기위해 대문자로 통일
		int len = str.length();
		for(int i = 0; i < len/2; i++) { //만약 입력이 gooG라면 len/2까지 비교하는 이유는인덱스 번호 0과1까지만 비교하면 된다. 인덱스 0,3 1,2이런식으로 비교해야하기 때문이다.
			if(str.charAt(i) != str.charAt(len-i-1)) { //위에 예를 든것을 그대로 설명하면 인덱스가 처음 즉 0일때 len-i-1을 해야 3번 인덱스를 가르키게 된다.
				return "NO";
			}
		}*/
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(solution(str));
	}

}
