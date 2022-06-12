package p74;

public class 피보나치재귀 {
	static int[] fibo;
	
	public static int DFS(int n) {
		if(fibo[n] > 0) return fibo[n]; //메모이제이션 미리찾아서 줄이기
		if (n == 1) {
			return fibo[n] = 1;
		} else if (n == 2) {
			return fibo[n] = 1;
		} else {
			return fibo[n] = DFS(n - 2) + DFS(n - 1);
		}
	}

	public static void main(String[] args) {
		int n = 10;
		fibo = new int[n+1];
		DFS(n);
		for (int i = 1; i <= n; i++)
			System.out.print(fibo[i] + " ");
	}

}
