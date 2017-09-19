package TreeMedium;

import java.util.Stack;

// similar to No 94 and No 98

public class No230KthSmallestElementinaBST {

	public int kthSmallest(TreeNode root, int k) {
        // 3 solution
        Stack<TreeNode> stack = new Stack<>();
        
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (--k == 0) break;
            root = root.right;
        }
        return root.val;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
