import java.util.Scanner;

public class p10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int[] arr = new int[26];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1; //arr배열 -1로 초기화
		}
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i); //알파벳 위치 계산하기위해 char변수 선언
			if(arr[ch-97]==-1) { //b가 맨처음나왔으면 arr[1]=0이 된다. if문은 중복이 나왔을때 원소 값이 -1인 경우에만 초기화 시키기 위해 사용
				arr[ch-97] = i;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
		
		
		/*Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for(char i = 'a'; i <= 'z'; i++) {
			System.out.print(str.indexOf(i)+" ");
		}*/
	}

}
