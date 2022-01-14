import java.util.Scanner;

class array {
	public String solution(String str) {
		String answer = "";
		int m = Integer.MIN_VALUE , pos;
		while((pos = str.indexOf(' '))!=-1) { //띄어쓰기가 발견되는 index번호를 return 마지막에 띄어쓰기가 없으면 끝남 while문
			                                  //첫번째로 발견되는 띄어쓰기의 위치를 리턴
			String tmp = str.substring(0, pos); //0부터 pos전까지 잘라냄
			int len = tmp.length();
			if(len > m) {
				m = len; //최댓값으로 변경
				answer = tmp;
			}
			str = str.substring(pos+1); //while문 한번 돌고 에를 들어 it is time 이 있다면 it을 삭제하고 is time이 str로 바뀜
		}  //공백이 안나올때 까지 반복
		if(str.length() > m) answer=str; //마지막 단어가 str이므로 마지막 단어가 m보다 크면 answer가 str
	
		/*String[] s = str.split(" ");
		for(String x : s) {
			int len = x.length();
			if(len>m) {
				m = len;
				answer = x;
			}  //최댓값 찾는 알고리즘
		}*/
		
		return answer;
	}

	public static void main(String[] args) {
		array T = new array();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.print(T.solution(str));

	}

}
