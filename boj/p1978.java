import java.util.Scanner;

public class p1978 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		int answer = 0;
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.next();
		}
		for(int i = 0; i < n; i++) {
			int tmp = Integer.parseInt(new StringBuilder(arr[i]).toString());
			boolean prime = true;
			if(tmp == 1) {
				continue;
			}
			for(int j = 2; j < tmp; j++) {
				if(tmp % j == 0) {
					prime = false;
					break;
				}
			}
			if(prime) {
				answer++;
			}
		}
		System.out.println(answer);
		
	}

}
