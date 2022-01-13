import java.util.Scanner;

public class 대소문자변환 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str1 = "";
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if((65 <= ch) && (ch <= 90)) { //문자 65 <= ch <= 90 대문자인 경우
				str1 = str1 + str.valueOf(ch).toLowerCase();
			}
			else if((97 <= ch) && (ch <= 122)) { //문자 97 <= ch <= 122 소문자인 경우
				str1 = str1 + str.valueOf(ch).toUpperCase();
			}
			else {
				break;
			}
		}
		System.out.print(str1);
	
	}

}
