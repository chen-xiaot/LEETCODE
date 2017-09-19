package TreeEasy;

import java.util.Stack;

public class No538ConvertBSTtoGreaterTree {

	int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        convert(root);
        return root;
    }
    private void convert(TreeNode cur) {
        if (cur == null) return;
        convert(cur.right);
        cur.val += sum;
        sum = cur.val;
        convert(cur.left);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class ConvertBSTtoGreaterTree {
	
	public TreeNode convertBST(TreeNode root) {
        if (root == null) return null;
        Stack<TreeNode> stack = new Stack<>();
        int sum = 0;
        TreeNode cur = root;
        while (!stack.isEmpty() || cur != null) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.right;
            }
            cur = stack.pop();
            int temp = cur.val;
            
            cur.val += sum;
            sum += temp;
            
            cur = cur.left;
        }
        return root;
    }
}