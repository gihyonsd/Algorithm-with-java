import java.util.Scanner;

public class p11025 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int ans = 0;
		for(int i = 2; i <=n; i++) {
			ans = (ans + k) % i;
		}
		System.out.println(ans + 1);
	}

}
