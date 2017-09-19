package TreeEasy;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class No107BinaryTreeLevelOrderTraversal2 {

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();   // linked list
        Queue<TreeNode> queue = new LinkedList<TreeNode>();  // queue linked-list
        
        if (root == null) return res;
        queue.offer(root);            // queue.offer
        while (!queue.isEmpty()) {
            int quantity = queue.size();
            List<Integer> list = new LinkedList<Integer>();
            
            for (int i = 0; i < quantity; i++) {
                if(queue.peek().left != null) queue.offer(queue.peek().left); // queue.peek
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                list.add(queue.poll().val);  // queue.poll
            }
            res.add(0, list);  //linked-list add(index, element);
        }
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
