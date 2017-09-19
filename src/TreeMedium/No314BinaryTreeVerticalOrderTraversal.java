package TreeMedium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class No314BinaryTreeVerticalOrderTraversal {

	public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
    	if (root == null) {
        	return res;
    	}
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
    	Queue<TreeNode> queue = new LinkedList<>();
    	Queue<Integer> cols = new LinkedList<>();

        queue.add(root); 
    	cols.add(0);
        
        int left = 0, right = 0;
        
        while (!queue.isEmpty()) {
        	TreeNode node = queue.poll();
        	int col = cols.poll();
            
            map.computeIfAbsent(col, k -> new ArrayList<Integer>()).add(node.val);
            
            if (node.left != null) {
            	queue.add(node.left); 
            	cols.add(col - 1);
            	left = Math.min(left, col - 1);
        	}
        
        	if (node.right != null) {
            	queue.add(node.right);
            	cols.add(col + 1);
            	right = Math.max(right, col + 1);
        	}
        }
        
        for (int i = left; i <= right; i++) {
            res.add(map.get(i));
		}
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
