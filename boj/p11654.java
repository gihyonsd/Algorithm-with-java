import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class p11654 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		byte[] bytes = n.getBytes(StandardCharsets.US_ASCII);
		System.out.println(bytes[0]);
		
	}

}