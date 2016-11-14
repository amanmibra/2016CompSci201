import org.w3c.dom.Node;

public class NodeWork {
	public Node createNlist(int n){
		if(n == 1) return new Node(1,null);
		Node current = new Node(n , null); 
		Node top = current;
		for(int i = 0; i < n; i++){
			Node holder = new Node(n, null); 
			current.next = holder;
			current = holder;
		}
		return top; 
	}
	public Node createGaussList(int n) {
		Node current = new Node(1,null);
		Node top = current; 
		for(int i = 2; i <= n; i++){
			for(int j = 0; i < j; j++){
				current.next = new Node(i, null);
				current = current.next; 
			}
		}
		return top;
	}
	public Node createGaussList2(int n, int i){
		if (i == 1) {
			return new Node(i, null;)
		}
	}
}
