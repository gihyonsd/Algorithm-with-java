package p24;

import java.util.Scanner;

public class 피보나치수열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 = 0, n2 = 1;
		int n3 = 1;
		
		for(int i = 0; i < n; i++) {
			System.out.print(n3+" ");
			n3 = n1+n2; //두 값을 더하고
			n1 = n2; // n1은 n2로 바꿔 준 후
			n2 = n3; // n2를 더한 값으로 바꿔준다
		}
	}


}

/*import java.util.Scanner;

public class 피보나치수열fix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n+2];
		a[0] = 1;
		a[1] = 1;
		for(int i = 0; i < n; i++) {
			a[i+2]=a[i+1]+a[i];
			System.out.print(a[i]+" ");
		}
	}

}*/
