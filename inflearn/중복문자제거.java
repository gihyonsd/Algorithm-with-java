package p6;

import java.util.Scanner;

public class 중복문자제거 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String result = "";
		for(int i = 0; i <str.length(); i++) {
			if(!result.contains(str.valueOf(str.charAt(i)))){ //사용자가 입력한 문자열을 String으로 바꾸고 result에 str에 중복되지 않은 문자가 들어간다면
				result += str.valueOf(str.charAt(i)); //result에 결과 저장 
			}
			
		}
		System.out.print(result);
		
		

	}

}
