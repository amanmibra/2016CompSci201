

public class QuasiIsomorphic {
	public String sameShape(TreeNode s, TreeNode t) {
		String same = "same";
		String ss = "different";
		String dd = "different";
		if(s == null && t == null)return "same";
		if(s == null || t == null)return "different";
		
		if(same.equals(sameShape(s.right, t.right)) && same.equals(sameShape(s.left, t.left))){
			ss = same;
		}
		if(same.equals(sameShape(s.right, t.left)) && same.equals(sameShape(s.left, t.right))){
			dd = same;
		}
		if(ss.equals(same) || dd.equals(same)) return same;
		return "different";
	}
}