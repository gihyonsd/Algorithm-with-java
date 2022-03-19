package 자바100제;

import java.util.Scanner;

public class CosPattern { //배열 내 각 숫자들의 빈도 수 출력하기

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] answer = new int[4]; //arr배열의 숫자들의 종류 만큼 크기를 지정해준다.
		for(int i = 0; i < n; i++) {
			answer[arr[i]]++; //answer 배열 내 숫자가 빈 배열의 인덱스로 적용되서 해당 인덱스의 answer 배열 요소의 값을 1 씩 증가시킨다.
		}
		for(int i = 0; i < answer.length; i++) {
			System.out.println(i+" 번 숫자 --> "+arr[i]+"회");
		}
	}

}
