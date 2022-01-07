import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;



public class p10989 {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	int n = Integer.parseInt(br.readLine());
    	int[] num = new int[n];
    	
    	for(int i=0; i<n; i++) {
    		num[i] = Integer.parseInt(br.readLine());
    	}
    	
    	Arrays.sort(num);
    	
    	for(int i : num) {
    		sb.append(i).append("\n");
    	}
    	bw.write(sb.toString());
    	bw.flush();
    	bw.close();
    	br.close();

    }
}
