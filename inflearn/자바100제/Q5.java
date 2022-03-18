package practice;

public class Q5 {

	public static void main(String[] args) {
		int a, b, c;
		for(a = 1; a <= 18; a++) {
			for(b = 1; b <= 18; b++) {
				for(c = 1; c <= 18; c++) {
					if((a*a)+(b*b)==(c*c) && a + b + c <= 20)
						System.out.println(a+" "+b+" "+c);
				}
			}
		}
	}

}
