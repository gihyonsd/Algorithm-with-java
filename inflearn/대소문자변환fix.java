import java.util.Scanner;

class Main {
	public String solution(String str) {
		String answer="";
		for(char x : str.toCharArray()) { //char로 변환
			/*if(Character.isLowerCase(x)) { //소문자가 나오면
				answer += Character.toUpperCase(x); //answer에 x대문자화 하여 누적 저장
			} else { //대문자가 나오면
				answer += Character.toLowerCase(x); //answer에 x소문자화 하여 누적 저장
			}*/
			if(x >= 97 && x<= 122) {//소문자 아스키번호 97<=x<=127, 대문자 아스키번호 65<=x<=90				
				answer += (char)(x-32); //소문자와  대문자의 차이는 32 대문자를 소문자화 시키려면 32를 더하고 소문자를 대문자화 시키려면 32를 뺀다.
			}
			else {
				answer += (char)(x+32);
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(T.solution(str));

	}

}
