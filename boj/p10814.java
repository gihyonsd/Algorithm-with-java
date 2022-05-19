import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class p10814 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[][] arr = new String[n][2];
		for(int i = 0; i < n; i++) {
			arr[i][0] = sc.next();
			arr[i][1] = sc.next();
		}
		Arrays.sort(arr, new Comparator<String[]> () {
			@Override
			public int compare(String[] one, String[] two) {
				return Integer.compare(Integer.parseInt(one[0]),Integer.parseInt(two[0]));
			}
		});
		
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
		
	}

}
