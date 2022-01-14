package p4;

import java.util.ArrayList;
import java.util.Scanner;

class Main {
	public ArrayList<String> solution(int n, String[] str){
		ArrayList<String> answer = new ArrayList<>();
		for(String x : str) {
			char[] s = x.toCharArray(); //s에 문자 하나하나 배열로 넣어줌
			int lt = 0, rt = x.length()-1; // lt는 문자의 처음 rt는 문자의 끝을 의미
			while(lt<rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			} //string을 원소로 같는 arraylist에 추가해서 return 
			String tmp = String.valueOf(s); //s문자 배열 string화시켜 tmp에 넣음
			answer.add(tmp);
		}
			
		/*for(String x : str) {
			String tmp = new StringBuilder(x).reverse().toString(); //stringbuilder에 reverse 메소드 사용하기위하여 
			answer.add(tmp); //arraylist에 뒤집어진 원소 추가
		}*/
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String [] str= new String[n];
		for(int i = 0; i < n; i++) {
			str[i] = sc.next();
		}
		for(String x : T.solution(n, str)) {
			System.out.println(x);
		}
	
	}

}
