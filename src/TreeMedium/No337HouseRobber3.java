package TreeMedium;

public class No337HouseRobber3 {

	public int rob(TreeNode root) {
        int [] res = robSub(root);
        return Math.max(res[0], res[1]);
    }
    
    private static int[] robSub(TreeNode root) {
        if (root == null) return new int[2];
        
        int[] left = robSub(root.left);
        int[] right = robSub(root.right);
        int[] res = new int[2];
        
        res[0] = root.val + left[1] + right[1];
        res[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
