package p57;

import java.util.*;

public class 교육과정설계fix {
	public static String solution(String need, String plan) {
		String answer = "YES";
		Queue<Character> q = new LinkedList<>();
		for(char x : need.toCharArray()) {
			q.offer(x);
		}
		for(char x : plan.toCharArray()) {
			if(q.contains(x)) {
				if(x != q.poll()) {
					return "NO";
				}
			}
		}
		if(!q.isEmpty()) {
			return "NO";
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		System.out.println(solution(a,b));
	}

}
