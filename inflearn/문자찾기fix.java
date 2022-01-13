import java.util.Scanner;

class Main {
	public int solution(String str, char t) {
		int answer = 0;
		str = str.toUpperCase();
		t = Character.toUpperCase(t); //문자열과 char형 대문자로 변경 비교하기 쉽게
		
		/*for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == t) { //문자 하나하나 비교하기위한 for문
				answer++;
			}
		}*/
		
		for(char x : str.toCharArray()) { //str문자 배열로 변경
			if(x==t) answer++;
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String str = sc.next(); // 문자열 받기
		char c = sc.next().charAt(0); //문자열에서 0번에 있는 문자 받기
		
		
		System.out.print(T.solution(str, c));

	}

}
