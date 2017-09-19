package TreeEasy;

public class No572SubtreeofAnotherTree {

	public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) return false;  // 每个recursion里面要判断当前的root是不是有效，不然会run time error
        if (isSame(s, t)) return true;
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }
    
    public boolean isSame(TreeNode s, TreeNode t) {
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;
        if (s.val != t.val) return false;
        return isSame(s.left, t.left) && isSame(s.right, t.right); 
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
