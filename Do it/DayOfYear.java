package chap02;
import java.util.Scanner;
//그 해 경과 일 수를 구함

public class DayOfYear {
	//각 달의 일수
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, //평년
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, //윤년
	};
	
	//서기 year년은 윤년인가? (윤년 : 1/ 평년 : 0)
	static int isLeap(int year) {
		return(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	//서기 y년 m월 d일의 그 해 경과 일 수를 구함
	static int dayOfYear(int y, int m, int d) {
		int days = d; //일수
		
		for(int i = 1; i < m; i++) { //1월~(m-1)월의 일 수를 더함
			days += mdays[isLeap(y)][i - 1]; //isLeap(y)==>윤년 이면 1, 평년이면 0
		}
		return days;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int retry;
		
		System.out.println("그 해 경과 일수를 구합니다.");
		
		do {
			System.out.print("년 :"); int year = sc.nextInt(); //년
			System.out.print("월 :"); int month = sc.nextInt(); //월
			System.out.print("일  :"); int day = sc.nextInt(); //일
			
			System.out.printf("그 해 %d일 째 입니다.\n", dayOfYear(year, month, day));
			
			System.out.print("한 번 더 할까요? (1.예 / 0. 아니오) : ");
			retry = sc.nextInt();
		} while(retry == 1);
		
	}

}
