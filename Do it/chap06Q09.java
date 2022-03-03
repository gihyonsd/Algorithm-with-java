package chap06;

import java.util.Scanner;

public class chap06Q09 {
	
	static int shellSort1(int[] a, int n) {
		int count = 0;
		for(int h = n / 2; h > 0; h /= 2) {
			for(int i = h; i < n; i++) {
				int j;
				int tmp = a[i];
				for(j = i - h; j >= 0 && a[j] > tmp; j -= h) {
					a[j + h] = a[j];
					count++;
				}
				a[j + h] = tmp;
				count++;
			}
		}
		return count;
	}
	
	static int shellSort2(int[] a, int n) {
		int count = 0;
		int h;
		for(h = 1; h < n / 9; h = h * 3 + 1) {
			;
		}
		for(; h > 0; h /= 3) {
			for(int i = h; i < n; i++) {
				int j;
				int tmp = a[i];
				for(j = i - h; j >= 0 && a[j] > tmp; j -= h) {
					a[j + h] = a[j];
					count++;
				}
				a[j + h] = tmp;
				count++;
			}
		}
		return count;
	}
	

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("셸 정렬");
		System.out.print("요솟수 :");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.print("x["+i+"]:");
			x[i] = sc.nextInt();
		}
		
		int count1 = shellSort1(x, nx);
		int count2 = shellSort2(x, nx);
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i = 0; i < nx; i++) {
			System.out.println("x["+i+"]="+x[i]);
		}
		System.out.println("count1 : " +count1);
		System.out.println("count2 : " +count2);
		
	}
}
