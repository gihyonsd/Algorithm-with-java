package p57;

import java.util.*;

public class 교육과정설계 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		String answer = "YES";
		Queue<Character> queue = new LinkedList<>();
		for(int i = 0; i < s1.length(); i++) {
			queue.offer(s1.charAt(i));
		}
		for(int j = 0; j < s2.length(); j++) {
			if(queue.contains(s2.charAt(j))) {
				if(queue.poll() != s2.charAt(j)) {
					answer = "NO";
				}
			}
		}
		if(!queue.isEmpty()) {
			answer = "NO";
		}
		System.out.println(answer);
	}

}
