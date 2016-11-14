
public class Isomorphic {
	public String sameShape(TreeNode s, TreeNode t) {
		if(s == null & t == null)return "same";
		if(s == null || t == null)return "different";
		String S = "same";
		if(sameShape(s.left,t.left).equals(S) && sameShape(t.right, s.right).equals(S)) return S;
		return "different";
	}
}