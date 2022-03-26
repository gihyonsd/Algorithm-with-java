package p41;

import java.util.HashMap;
import java.util.Scanner;

public class 학급회장fix {
	public static char solution(int n, String s) {
		char answer=' ';
		HashMap<Character, Integer> map = new HashMap<>();//key는 character, value는 Integer
		for(char key : s.toCharArray()) {
			map.put(key, map.getOrDefault(key, 0)+1); //x의 키값을 가져오되 없다면 0을 return 카운팅할 때 중요
		}
		//System.out.println(map.containsKey('A')); 'A'라는 키가 있는지 알려줌 true or false return 
		//System.out.println(map.size()); key의 개수를 알려줌
		//map.remove('A'); //A라는 키 값을 삭제함
		int max = Integer.MIN_VALUE;
		for(char key : map.keySet()) { //map객체를 탐색할 때 keySet으로 탐색함
			if(map.get(key) > max) {
				max=map.get(key);
				answer = key;      //map.get(x) x 키의 value 값을 가져온다는 의미
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		System.out.print(solution(n, str));
	}

}
