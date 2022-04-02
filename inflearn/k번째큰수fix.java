package p45;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class k번째큰수fix {
	public static int solution(int[] arr, int n, int k) {
		int answer = -1;
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
		//TreeSet 기본은 오름차순 정렬 Collections.reverseOrder를 쓰면 내림차순 정렬
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {//j는 i+1부터 돌아야함 i가 뽑은걸 j가 다시 뽑으면 안되기 때문
				for(int l = j+1; l < n; l++) {
					Tset.add(arr[i]+arr[j]+arr[l]); //TreeSet자료구조에 값 추가
				}
			}
		}
		int cnt = 0;
		//Tset.remove(143); //143 삭제
		//System.out.println(Tset.size()); //Tset 원소가 몇개인지 알려준다.
		//System.out.println(Tset.first()); //오름차순이면 최솟값을 리턴 내림차순이면 최댓값을 리턴
		//System.out.println(Tset.last()); //오름차순이면 최댓값을 리턴 내림차순이면 최솟값을 리턴
		for(int x : Tset) { //Tset 값 탐색 x에 대응된다.
			cnt++; //cnt가 x가 몇번째인지 알려준다.
			if(cnt == k) return x; //cnt가 k번째와 같다면 return x 
			
		}
		
		return answer; //k번째 수가 아니라면 -1 리턴
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(arr,n,k));
	}

}
