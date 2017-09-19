package TreeEasy;

//For every node, length of longest path which pass it 
//= MaxDepth of its left subtree + MaxDepth of its right subtree.

public class No543DiameterofBinaryTree {
	int max = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null || root.left == null && root.right == null) return 0;
        maxDepth(root);
        return max;
    }
    
    private int maxDepth(TreeNode node) {
        if (node == null) return 0;
        int left = maxDepth(node.left);
        int right = maxDepth(node.right);
        
        max = Math.max(max, left + right);
        return Math.max(left, right) + 1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
