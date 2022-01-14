package p4;

/*import java.util.Scanner;

public class 단어뒤집기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			String str = sc.next();
			String reversed = new StringBuffer(str).reverse().toString();
			System.out.println(reversed);
		}
	}

}*/

import java.util.*;

public class 단어뒤집기 {

	public static void main(String[] args) {
		ArrayList<String> answer = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n];
		for(int i = 0; i < n; i++) {
			str[i] = sc.next();
		}
		for(int i = 0; i<str.length; i++) {
			String x = str[i];
			char[] s = x.toCharArray();
			int lt = 0, rt = x.length() -1;
			while(lt<rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(s);
			answer.add(tmp);
		}
		for(int i = 0; i < answer.size(); i++) {
			System.out.println(answer.get(i));
		}

	}

}

