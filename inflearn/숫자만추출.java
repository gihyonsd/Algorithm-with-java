package p9;

import java.util.Scanner;

public class 숫자만추출 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int s1 = Integer.parseInt(str.replaceAll("[^0-9]","")); //10진수의 Integer형으로 리턴
		System.out.print(s1);
	}

}
