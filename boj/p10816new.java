import java.util.HashMap;
import java.util.Scanner;

public class p10816new {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < n; i++) {
			int input = sc.nextInt();
			map.put(input, map.getOrDefault(input, 0)+1);
		}
		int m = sc.nextInt();
		for(int i = 0; i < m; i++) {
			int input = sc.nextInt();
			sb.append(map.getOrDefault(input, 0)+" ");
		}
		System.out.println(sb);
		
	}

}
