import java.util.Scanner;

public class p1065 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(ap(sc.nextInt()));
		sc.close();
		
	}
	public static int ap(int num) {
		int count = 0;
		if(num < 100) {
			return num;
		} else {
			count = 99;
			if(num == 1000) {
				num = 999;
			}
			for (int i = 100; i <= num; i++) {
				int x = i/100;
				int y = (i/10)%10;
				int z = i%10; //xyz 순으로 백의자리, 십의자리, 일의자리
				
				if((x-y) == (y-z)) { //등차수열을 이루면
					count++;
				}
			}
		}
		return count;
	}

}
