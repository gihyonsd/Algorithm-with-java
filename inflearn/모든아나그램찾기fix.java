package p44;

import java.util.HashMap;
import java.util.Scanner;

public class 모든아나그램찾기fix {
	public static int solution(String str1, String str2) {
		int answer = 0;
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		
		for(char x : str2.toCharArray()) {
			map2.put(x, map2.getOrDefault(x, 0)+1);
		}
		for(int i = 0; i < str2.length()-1; i++) {
			map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0)+1);
		}
		int lt = 0;
		for(int rt = str2.length()-1; rt < str1.length(); rt++) {
			map1.put(str1.charAt(rt), map1.getOrDefault(str1.charAt(rt), 0)+1);
			if(map1.equals(map2)) answer++;
			map1.put(str1.charAt(lt), map1.get(str1.charAt(lt))-1);
			if(map1.get(str1.charAt(lt))==0) map1.remove(str1.charAt(lt));
			lt++;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		System.out.print(solution(s,t));
	}

}
