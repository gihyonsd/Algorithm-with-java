import java.util.Scanner;

public class p11721 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for(int i=0; i<str.length(); i++) {
			if(i%10==0 && i!=0) {
				System.out.println();
			}
			System.out.print(str.charAt(i));
		}		
	}
			
}		