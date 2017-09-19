package leetcode20;

public class NO226InvertBinaryTree {

	 class TreeNode {
		 int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	}

		    public TreeNode invertTree(TreeNode root) {
		        
		        if(root==null) return null;
		        
		        TreeNode temp=root.left;
		        root.left=invertTree(root.right);
		        root.right=invertTree(temp);
		        
		        return root;
		        
		    }
	
		 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
