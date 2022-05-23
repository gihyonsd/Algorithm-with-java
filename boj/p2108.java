import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class p2108 {
	public static int mode(int[] arr) {
		int[] index = new int[8001];
		ArrayList<Integer> list = new ArrayList<>();
		int max = Integer.MIN_VALUE;
		for (int x : arr) {
			if (x < 0) {
				index[Math.abs(x) + 4000]++;
			} else {
				index[x]++;
			}
		}
		int mode = 0;
		for (int i = 0; i < index.length; i++) {
			if (index[i] != 0 && max < index[i]) {
				max = index[i];
				mode = i;
			}
		}
		for (int i = 0; i < index.length; i++) {
			int x = i;
			if (index[i] == max) {
				if (i > 4000) {
					x -= 4000;
					x *= -1;
					list.add(x);
				} else {
					list.add(i);
				}
			}

		}
		Collections.sort(list); // 최빈값들이 다수 존재하면 오름차순 정렬

		if (list.size() > 1) {
			return list.get(1);
		} else {
			return list.get(0);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sum = 0;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		double result = 0;
		result = Math.round(sum/n);
		System.out.println((int)Math.ceil(result));
		Arrays.sort(arr);
		System.out.println(arr[n / 2]);
		System.out.println(mode(arr));
		System.out.println(arr[arr.length-1] - arr[0]);
	}

}
