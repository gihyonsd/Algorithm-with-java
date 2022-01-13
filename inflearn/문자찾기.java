import java.util.Scanner;
  
public class 문자찾기 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String str1 = str.toUpperCase();
    char ch = sc.next().toUpperCase().charAt(0);
    char charUpper = Character.toUpperCase(ch);
    
    int count = 0;
    
    for (int i = 0; i < str.length(); i++) {
    	if(str1.charAt(i) == charUpper) {
    		count++;
    		
    	}
    }
    System.out.println(count);
  }
}