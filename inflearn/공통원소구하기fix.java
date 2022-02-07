package p32;

import java.util.*;

public class 공통원소구하기fix {//오름차순으로 정렬하기
	public static ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
		ArrayList<Integer> answer = new ArrayList<>();
		Arrays.sort(a);
		Arrays.sort(b); //오름차순 정렬
		int p1 = 0, p2 = 0; //투포인터
 		while(p1<n && p2<m) { 
			if(a[p1]==b[p2]) {
				answer.add(a[p1++]);
				p2++;  //두 값이 같다면 add하고 포인터 증가
			}
			else if(a[p1]<b[p2]) {
				p1++; //p2의 값이 더 크면 p1 증가 (p1이 증가하는 이유는 p2에 더이상 그 값이 나올리가 없기 때문이다)
			}
			else {
				p2++; //p1값이 더 크면 p2증가
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] b = new int[m];
		for(int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}
		for(int x : solution(n,m,a,b)) System.out.print(x+ " ");
	}

}
