import java.util.Arrays;
import java.util.Scanner;

public class p1920 {
	public static int binarySearch(int m, int[] arr) {
		int answer = 0;
		int mid;
		int left = 0;
		int right = arr.length - 1;
		while(left <= right) {
			mid = (right + left) / 2;
			
			if(arr[mid] == m) {
				return mid+1;
			}
			if(m < arr[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return -1;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int m = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < m; i++) {
			if(binarySearch(sc.nextInt(),arr) >= 0) {
				sb.append(1).append('\n'); 
			}else {
				sb.append(0).append('\n'); 
			}
		}
		System.out.println(sb);
		

	}

}
