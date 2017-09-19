package TreeEasy;

public class No110BalancedBinaryTree {

	public boolean isBalanced(TreeNode root) {
        return maxDepth(root) != -1;
    }
    
    private static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
            return -1;
        }
        return Math.max(left, right) + 1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
