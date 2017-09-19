package TreeMedium;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class No103BinaryTreeZigzagLevelOrderTraversal {

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        boolean order = true;
        if (root == null) return res;
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new LinkedList<Integer>();
            for (int i = 0; i < size; i++) {
                if (queue.peek().left != null) queue.offer(queue.peek().left);
                if (queue.peek().right != null) queue.offer(queue.peek().right);
                if (order) {
                    list.add(queue.poll().val);
                }
                else {
                    list.add(0, queue.poll().val);
                }
            }
            order = order == true ? false : true;
            res.add(list);
        }
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
