public class p4673 {
	public static int d(int n) {
		int sum = n;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
			if (sum > 9999) {
				return 0;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] self = new int[10000];
		for (int i = 1; i < 10000; i++) {
			self[d(i)]++;
		}
		for (int i = 1; i < self.length; i++) {
			if (self[i] == 0) {
				System.out.println(i);
			}
		}
	}

}
