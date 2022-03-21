package 자바100제;

import java.util.Scanner;

public class CosPattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;
		//System.out.print("n까지 짝수만 출력 시킬 수 입력 : ");
		//int m = sc.nextInt();
		/*while(n <= m) {
			if(n%2!=0) { //n이 짝수가 아니면 n증가 후 continue
				n++;
				continue;
			}
			System.out.print(n+" ");
			n++;
		}*/
		System.out.print("n까지 홀수만 출력 시킬 수 입력 : ");
		int m = sc.nextInt();
		while(n <= m) {
			if(n%2==0) { //n이 짝수이면 n증가 후 continue;
				n++;
				continue;
			}
			System.out.print(n+" ");
			n++;
		}
	}

}
