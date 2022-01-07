import java.util.Scanner;

public class p1546 {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[] arr = new int[n];
    	int max = 0;
    	int sum =0;
    	
    	for(int i=0; i<arr.length; i++) {
    		arr[i] = sc.nextInt();
    		if(max<arr[i]) {
    			max=arr[i];
    		}
    	}
    	for(int i=0; i<arr.length; i++) {
    		sum += arr[i];
    	}
    	double avg = (double)sum/(double)max*100/arr.length;
    	System.out.println(avg);
    }
}
