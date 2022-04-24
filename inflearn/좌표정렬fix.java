package p67;

import java.util.*;

class Point implements Comparable<Point> { //comparable 인터페이스의 구현 클래스
	public int x, y;
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public int compareTo(Point o) {
		if(this.x == o.x) {
			return this.y - o.y; //this 객체가 앞에 있고 매게변수로 넘어온 object객체가 뒤에 있게 하려면 this에서 object를 빼줘어야 오름차순 정렬 된다. 음수 값이 리턴 되도록 해주어야 한다. 오름차순이면
		}
		else {
			return this.x - o.x;
		}
	}
}
public class 좌표정렬fix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Point> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr.add(new Point(x,y));
		}
		Collections.sort(arr);
		for(Point o : arr) {
			System.out.println(o.x + " "+o.y);
		}
	}

}
