import java.util.*;

public class p11866 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		Queue<Integer> queue = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= n; i++) {
			queue.offer(i);
		}
		sb.append("<");
		while(queue.size() != 1) {
			for(int j = 1; j < k; j++) {
				queue.offer(queue.poll());
			}
			sb.append(queue.poll()+", ");
		}
		sb.append(queue.poll()+">");
		System.out.print(sb);
	}

}
