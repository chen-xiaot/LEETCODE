package TreeEasy;



public class No104MaximumDepthofBinaryTree {

	public int maxDepth(TreeNode root) {
        int leftDepth = 0, rightDepth = 0;
        if (root == null) {
            return 0;
        }
        
        leftDepth = maxDepth(root.left);
        rightDepth = maxDepth(root.right);
        
        return Math.max(leftDepth, rightDepth) + 1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
