import java.util.Scanner;

public class p2018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = 1, cnt = 1;
		int n = sc.nextInt();
		n--;
		while(n>0) {
			cnt++;
			n = n - cnt;
			if(n%cnt==0) answer++;
		}
		System.out.print(answer);
	}

}
