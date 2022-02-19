package chap06;

import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;
import java.util.Arrays;
//달력의 배열을 정렬

public class SortCalendar {

	public static void main(String[] args) {
		GregorianCalendar[] x = {
				new GregorianCalendar(2022, FEBRUARY, 19),
				new GregorianCalendar(1963, OCTOBER, 18),
				new GregorianCalendar(1985, APRIL, 5),
		};
		
		Arrays.sort(x); //배열 x를 정렬
		
		for(int i = 0; i < x.length; i++) {
			System.out.printf("%04d년 %02d월 %02d일\n",
			x[i].get(YEAR), x[i].get(MONTH) + 1, x[i].get(DATE));
		}
		//GregorianCalender 클래스는 1~12월을 0~11로 표현 그래서 1을 더한다.
	}

}
