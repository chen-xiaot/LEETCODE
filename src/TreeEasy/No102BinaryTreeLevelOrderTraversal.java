package TreeEasy;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class No102BinaryTreeLevelOrderTraversal {

	public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        
        if (root == null) return res;
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            int quantity = queue.size();
            List<Integer> list = new LinkedList<Integer>();
            for (int i = 0; i < quantity; i++) {
                if (queue.peek().left != null) queue.offer(queue.peek().left);
                if (queue.peek().right != null) queue.offer(queue.peek().right);
                list.add(queue.poll().val);
            }
            res.add(list);
        }
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
