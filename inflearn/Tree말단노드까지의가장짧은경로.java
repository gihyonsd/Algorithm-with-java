package p79;

class Node {
	int data;
	Node lt, rt;
	public Node(int val) {
		data = val;
		lt=rt=null;
	}
}


public class Tree말단노드까지의가장짧은경로 {
	Node root;
	public int DFS(int L, Node root) { //root가 가르키는게 말단 노드면 L을 리턴 그러면 정답
		if(root.lt == null && root.rt == null) return L;
		else return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt)); //자식 노드 중 작은 값을 리턴
		// 밑을 예를들면 2는 레벨 2를 리턴받고 3은 1을 리턴받아서 가장 작은 값인 1을 리턴해 준다.
		
		
	}
	public static void main(String[] args) {
		Tree말단노드까지의가장짧은경로 tree = new Tree말단노드까지의가장짧은경로();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		System.out.println(tree.DFS(0, tree.root)); //레벨 0부터 말단 노드 시작
	}
}
