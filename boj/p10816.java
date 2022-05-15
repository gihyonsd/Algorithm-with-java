import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class p10816 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < n; i++) {
			int input = sc.nextInt();
			if(map.get(input) == null) {
				map.put(input, 1);
			} else {
				map.put(input, map.get(input) + 1);
			}
		}
		int m = sc.nextInt();
		for(int i = 0; i < m; i++) {
			int input = sc.nextInt();
			if(map.get(input) == null) {
				sb.append(0).append(" ");
			} else {
				sb.append(map.get(input)).append(" ");
			}
		}
		System.out.println(sb);
	}

}
