
public class PathSum {
	public int hasPath(int target, TreeNode tree){
		if(tree == null)return 0;
		if(tree.left == null && tree.right == null && target == tree.info) return 1;
		return Math.max(hasPath(target-tree.info, tree.left), hasPath(target-tree.info, tree.right));
	}
}