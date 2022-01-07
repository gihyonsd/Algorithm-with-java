import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class p2751 {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	StringBuilder sb = new StringBuilder();
    	int n = sc.nextInt();
    	ArrayList<Integer> num = new ArrayList<>();
    	
    	for(int i=0; i<n; i++) {
    		num.add(sc.nextInt());
    	}
    	
    	Collections.sort(num);
    	for(int i : num) {
    		sb.append(i).append("\n");
    	}
    	System.out.println(sb);

    }
}
