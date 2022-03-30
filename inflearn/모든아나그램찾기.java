package p44;

import java.util.HashMap;
import java.util.Scanner;

public class 모든아나그램찾기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		int answer = 0;
		for(char x : t.toCharArray()) {
			map2.put(x, map2.getOrDefault(x, 0)+1);
		}
		for(int i = 0; i < t.length()-1; i++) {
			map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0)+1);
		}
		int lt = 0;
		for(int rt = t.length()-1; rt < s.length(); rt++) {
			map1.put(s.charAt(rt), map1.getOrDefault(s.charAt(rt), 0)+1);
			if(map1.equals(map2)) answer++;
			map1.put(s.charAt(lt),map1.get(s.charAt(lt))-1);
			if(map1.get(s.charAt(lt))==0) map1.remove(s.charAt(lt));
			lt++;
		}
		System.out.print(answer);
	}

}
