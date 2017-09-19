package TreeEasy;

public class No101SymmetricTree {

	public boolean isSymmetric(TreeNode root) {
        return root == null || isSymmetric(root.left, root.right);
    }
    
    private static boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null || right == null) return left == right;
        if (left.val != right.val) return false;
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
