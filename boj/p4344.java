import java.util.Scanner;

public class p4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		int[] arr;
		
		for(int i = 0; i < testcase; i++) {
			
			int x = sc.nextInt();
			arr = new int[x];
			
			double sum = 0;
			
			for(int j = 0; j < x; j++) {
				int grade = sc.nextInt();
				arr[j] = grade;
				sum += grade;				
			}
			
			double ans = (sum/x);
			double count = 0;
			
			for(int j = 0; j < x; j++) {
				if(arr[j] > ans) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n",(count/x)*100);
		}
		
	}

}
