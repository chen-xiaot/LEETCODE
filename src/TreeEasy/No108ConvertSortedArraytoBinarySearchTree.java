package TreeEasy;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){
		val = x;
	}
}

public class No108ConvertSortedArraytoBinarySearchTree {

	public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        
        TreeNode root = convert(nums, 0, nums.length-1);
        return root;
    }
    
    public static TreeNode convert(int[] nums, int left, int right){
        if(left > right) return null;
        
        int mid = left + (right-left)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = convert(nums, left, mid-1);
        node.right = convert(nums, mid+1, right);
        
        return node;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
