import java.util.Scanner;

public class p2750 {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[] num = new int[n];
    	
    	for(int i=0; i<num.length; i++) {
    		num[i] = sc.nextInt();
    	}
    	for(int i=0; i<num.length; i++) {
    		for(int j=i+1; j<num.length; j++) {
    			if(num[i] > num[j]) {
    				int temp = num[j];
    				num[j] = num[i];
    				num[i] = temp;
    			}
    		}
    	}
    	for(int i : num) {
    		System.out.println(i+"");
    	}

    }
}
