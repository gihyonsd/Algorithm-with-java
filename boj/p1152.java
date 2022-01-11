import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class p1152 {

	public static void main(String[] args) throws IOException {
		Scanner sc= new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				count++;
			}
		}
		count += 1;
		if(str.charAt(0) == ' ') {
			count--;
		}
		System.out.print(count);
	}

}
