
public class DepthSum {
	int count = 0;
	public int value(TreeNode tree){
		if(tree == null)return 0;
		return helper(tree, 1);
	}
	
	public int helper(TreeNode t, int level){
		if(t == null)return 0;
		return level * t.info + helper(t.left, level+1) + helper(t.right, level+1);
	}
}