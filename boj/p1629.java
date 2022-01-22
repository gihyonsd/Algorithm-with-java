import java.util.Scanner;

public class p1629 { //a는 밑 b는 지수
	public static long c;
	public static long solution(long a, long b) {
		if(b == 1) { //지수 1일 경우 a그대로 리턴
			return a%c;
		}
		long temp = solution(a, b/2);
		
		if(b%2 == 1) { //지수가 홀 수 경우 (a*b/2)*(a*b/2)*a이므로 a를 한 번 더 곱해야 함
			return (temp*temp%c)*a%c;
		}
		return temp*temp%c; //구했던 값을 제곱하여 리턴
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		c = sc.nextLong();
		System.out.print(solution(a,b));
	}

}
