import java.util.Scanner;

public class p1924 {

	public static void main(String[] args) {
		int day =0;
		Scanner sc = new Scanner(System.in);
		int month[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		int x=sc.nextInt();
		int y=sc.nextInt();
		for(int i=0; i<x-1; i++) {
			day += month[i];
		}
		day += y;
		day = day%7;
		
		switch(day) {
		case 1:
			System.out.println("MON");
			break;
		case 2: 
			System.out.println("TUE");
			break;
		case 3: 
			System.out.println("WED");
			break;
		case 4: 
			System.out.println("THU");
			break;
		case 5: 
			System.out.println("FRI");
			break;
		case 6: 
			System.out.println("SAT");
			break;
		case 0: 
			System.out.println("SUN");
			break;
		default:
			break;
		}
	
	}
			
}		
