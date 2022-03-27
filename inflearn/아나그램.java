package p42;

import java.util.HashMap;
import java.util.Scanner;

public class 아나그램 {

	public static void main(String[] args) {
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		String answer = " ";
		for(char x : str1.toCharArray()) {
			map1.put(x, map1.getOrDefault(x, 0)+1);
		}
		for(char x : str2.toCharArray()) {
			map2.put(x, map2.getOrDefault(x, 0)+1);
		}
		for(char x : map1.keySet()) {
			if(map1.get(x) == map2.get(x)) {
				answer = "YES";
			}
			else {
				answer = "NO"; break;
			}
			
		}
		System.out.print(answer);
		
	}

}
