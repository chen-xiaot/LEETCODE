package leetcode20;

public class NO404SumofLeftLeaves {
	

	class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	
		    public int sumOfLeftLeaves(TreeNode root) {
		        
		        if(root==null) return 0;
		        
		        int sum=0;
		        if(root.left!=null){
		            if(root.left.left==null && root.left.right==null){
		                sum+=root.left.val;
		            }
		            else sum+=sumOfLeftLeaves(root.left);
		        }
		        
		        sum+=sumOfLeftLeaves(root.right);
		        
		        return sum;
		        
		    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
