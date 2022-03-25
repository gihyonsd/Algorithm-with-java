package p41;

import java.util.HashMap;
import java.util.Scanner;

public class 학급회장 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		char answer = ' ';
		int max = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		for(char vote : str.toCharArray()) 
			map.put(vote, map.getOrDefault(vote, 0)+1);
		for(char vote : map.keySet()) {
			if(map.get(vote) > max) {
				max = Math.max(0, map.get(vote));
				answer = vote;
			}
		}
		System.out.print(answer);
	}
}
