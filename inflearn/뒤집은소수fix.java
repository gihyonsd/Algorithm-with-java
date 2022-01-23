package p26;

import java.util.ArrayList;
import java.util.Scanner;

public class 뒤집은소수fix {
	public static boolean isPrime(int num) {   //소수인지 아닌지 판별하는 함수
		if(num==1) {
			return false;
		}
		for(int i = 2; i < num; i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
		
	}   
	public static ArrayList<Integer> solution(int n, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int tmp = arr[i];
			int res = 0; 
			while(tmp > 0) { //숫자 뒤집기 int형을 이용 ex) tmp = 123 일때  1. t = 3 => res = 0*10+3 => tmp = 12
				                               //                2. t = 2 => res = 3*10+2 => tmp = 1
											   //                3. t = 1 => res = 32*10+1 => tmp = 0  ==>321로 뒤집힘
				int t = tmp%10;
				res = res*10+t;
				tmp = tmp/10;
			}
			if(isPrime(res)) answer.add(res); //res가 소수이면 answer에 add
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int x : solution(n,arr)) {
			System.out.print(x+" ");
		}
	}

}
