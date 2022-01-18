package p22;

import java.util.ArrayList;
import java.util.Scanner;

public class 큰수출력하기 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int[] arr = new int[n];
		 ArrayList<Integer> list = new ArrayList<>();
		 
		 for(int i = 0; i < n; i++) {
			 arr[i] = sc.nextInt();
		 }
		 int max = Integer.MIN_VALUE;
		 for(int i = 0; i < n; i++) {
			 int num = arr[i]; 
			 if(num > max) {
				 list.add(num); 
			 }
			 max = num;
		 } //1. max는 제일 낮은 수로 그 후 for문 돌리기  2. n만큼 for문 돌리기 3.num = arr[i]번째로 for문이 돌때 마다 초기화 4. num > max라면 list에 num추가 5. max는 num으로 초기화
		 for(Integer integer : list) {
			 System.out.print(integer+" ");
		 }
			
	}
	
}
