package TreeMedium;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class No449SerializeandDeserializeBST {

	private static final String SEP = ",";
    private static final String NULL = "null";

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return NULL;
        StringBuilder sb = new StringBuilder();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            root = stack.pop();
            sb.append(root.val).append(SEP);
            if (root.right != null) {
                stack.push(root.right);
            }
            if (root.left != null) {
                stack.push(root.left);
            }
        }
        return sb.toString();
    }
    
 // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals(NULL)) return null;
        String[] strs = data.split(SEP);
        Queue<Integer> queue = new LinkedList<>();
        for (String s : strs) {
            queue.offer(Integer.parseInt(s));
        }
        return getNode(queue);
    }
    
    private static TreeNode getNode(Queue<Integer> queue) {
        if (queue.isEmpty()) return null;
        TreeNode root = new TreeNode(queue.poll());
        Queue<Integer> samllerQueue = new LinkedList<>();
        while (!queue.isEmpty() && queue.peek() < root.val) {
            samllerQueue.offer(queue.poll());
        }
        root.left = getNode(samllerQueue);
        root.right = getNode(queue);
        return root;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
