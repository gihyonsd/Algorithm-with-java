import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class p10828 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		Stack<Integer> E = new Stack<>();
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			switch (st.nextToken()) {
			case "push":
				E.push(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				if(!E.isEmpty())
					System.out.println(E.pop());
				else
					System.out.println("-1");
				break;
			case "size":
				System.out.println(E.size());
				break;
			case "empty":
				if(!E.isEmpty())
					System.out.println("0");
				else
					System.out.println("1");
				break;
			case "top":
				if(!E.isEmpty())
					System.out.println(E.peek());
				else
					System.out.println("-1");
				break;
			
	  }
	}
	
  }

}
