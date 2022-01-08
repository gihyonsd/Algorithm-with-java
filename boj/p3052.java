import java.util.Scanner;

public class p3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt()%42;
		}
		for(int i=0; i<arr.length; i++) {
			int count1 = 0;
			for(int j=i+1; j<10; j++) {
				if(arr[i]==arr[j]) {
					count1++;
				}
			}
			if(count1==0) {
				count++;
			}
		}
		System.out.println(count);
		
		

	}

}
