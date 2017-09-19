package TreeEasy;

import java.util.ArrayList;
import java.util.List;

public class No257BinaryTreePaths {

	public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<String>();
        if (root != null) {
            binaryTreePaths(root, res, "");
        }
        return res;
    }
    
    private void binaryTreePaths(TreeNode root, List<String> res, String path) {
        if (root.left == null && root.right == null) {
            res.add(path + root.val);
        }
        if (root.left != null) {
            binaryTreePaths(root.left, res, path + root.val + "->");
        }
        if (root.right != null) {
            binaryTreePaths(root.right, res, path + root.val + "->");
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
