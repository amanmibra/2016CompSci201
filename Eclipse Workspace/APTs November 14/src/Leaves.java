import java.util.*;

public class Leaves {
	ArrayList<Integer> list = new ArrayList();
	Queue<TreeNode> queue = new LinkedList();
	public int[] getLeaves(TreeNode t) {
		if(t==null)return null;
		if(t.left == null && t.right == null){
			list.add(t.info);
			queue.add(t);
		}
		
		
		return new int[0];
	}
}