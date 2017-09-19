package TreeMedium;

import java.util.ArrayList;
import java.util.List;

public class No545BoundaryofBinaryTree {

	List<Integer> res = new ArrayList<>();
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        if (root == null) return res;
        
        res.add(root.val);
        leftBoundary(root.left);
        leaves(root.left);
        leaves(root.right);
        rightBoundary(root.right);
        
        return res;
    }
    private void leftBoundary(TreeNode node) {
        if (node == null || node.left == null && node.right == null) return;
        res.add(node.val);
        if (node.left == null) leftBoundary(node.right);
        else leftBoundary(node.left);
    }
    
    private void rightBoundary(TreeNode node) {
        if (node == null || node.left == null && node.right == null) return;
        if (node.right == null) rightBoundary(node.left);
        else rightBoundary(node.right);
        res.add(node.val);
    }
    
    private void leaves(TreeNode node) {
        if (node == null) return;
        if (node.left == null && node.right == null) {
            res.add(node.val);
            return;
        }
        leaves(node.left);
        leaves(node.right);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
