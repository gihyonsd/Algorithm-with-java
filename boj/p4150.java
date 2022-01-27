import java.math.BigInteger;
import java.util.Scanner;

public class p4150 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger n1 = new BigInteger("0");
		BigInteger n2 = new BigInteger("1");
		BigInteger n3 = new BigInteger("1");
		
		for(int i = 0; i < n; i++) {
			n3 = n1.add(n2);
			n1 = n2;
			n2 = n3;
		}
		System.out.print(n1);
	}

}
