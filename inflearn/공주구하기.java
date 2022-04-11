package p56;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 공주구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int answer = 0;
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			queue.add(i);
		}
		while (queue.size()!=1) {
			for(int j = 1; j < n; j++) {
				queue.add(queue.remove());
			}
			queue.remove();
		}
		answer=queue.poll();
		System.out.println(answer);
	}

}