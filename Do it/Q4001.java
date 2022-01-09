package chap04;

import java.util.Scanner;
//int 형 스택

public class Q4001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		InStack s = new InStack(64); // 최대 64개를 푸시할 수 있는 스택
		
		while (true) {
			System.out.println("현재 데이터 수 : " +s.size()+" / " + s.capacity());
			System.out.print("(1)푸시 (2)팝 (3)피크 " + "(4)덤프  (5)클리어 (6)스택이 비어있는지 (7)스택이 가득찼는지 (8)검색(0)종료 : ");
			System.out.println("(9)용량 (10)데이터 수");
			
			int menu = sc.nextInt();
			if (menu == 0) break;
			
			int x;
			switch (menu) {
			case 1: //푸시
				System.out.print("데이터  : ");
				x = sc.nextInt();
				try {
					s.push(x);
				} catch (InStack.OverflowStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;
				
			case 2: //팝
				try {
					x = s.pop();
					System.out.println("팝한 데이터는 " + x + " 입니다.");
					
				} catch (InStack.EmptyInStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;
			case 3: //피크
				try {
					x = s.peek();
					System.out.println("피크한 데이터는" + x + "입니다.");
				} catch (InStack.EmptyInStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;
				
			case 4: //덤프
				s.dump();
				break;
			case 5: //스택 초기화
				s.clear();
				System.out.println("스택 초기화");
				break;
			case 6:
				try {
					boolean result = s.isEmpty();
					if(result) {
						System.out.println("스택은 비어있습니다.");
						
					} else {
						System.out.println("스택은 비어 있지 않습니다.");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 7:
				try {
					boolean result = s.isFull();
					if(result) {
						System.out.println("스택은 가득 차 있습니다..");
						
					} else {
						System.out.println("스택은 가득 차 있지 않습니다.");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 8:
				try {
					System.out.print("찾을 데이터 입력 : ");
					int data = sc.nextInt();
					x = s.indexOf(data);
					System.out.println("찾은 데이터의 인덱스는 "+ x +"입니다.");
					
				} catch (Exception e) {
					System.out.println("인덱스를 찾을 수 없습니다.");
				}
				break;
			case 9:
				x = s.capacity();
				System.out.println("스택의 용량은 "+ x + "입니다.");
				
				break;
			case 10:
				x = s.size();
				System.out.println("스택의 데이터 수는 " + x + "입니다");

			}
		}
	}

}
