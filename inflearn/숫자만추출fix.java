package p9;

import java.util.Scanner;

public class 숫자만추출fix {
	 public static int solution(String s) {
		String answer = "";
		for(char x : s.toCharArray()) {
			if(Character.isDigit(x)) { //x가 숫자인가 물어봄 숫자면 참이된다
				answer += x; //answer에 누적 저장
			}
		}
		return Integer.parseInt(answer); //String화 되어있는것을 parseInt
	 }
	
	
	
	/*public static int solution(String s) {
		int answer = 0;
		for(char x : s.toCharArray()) {
			if(x>=48 && x <= 57) { //아스키넘버 '0'~'9' 까지를 의미 x가 그 사이에 있다면
				answer = answer*10+(x-48); //01205를 예로 들면 처음엔 0 그 후 answer가 1 그 후 answer가 12 로 앞의 연속된 0을 제외시키고 저장된다.
			}
		}
		return answer;
	}*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(solution(str));
	}

}
