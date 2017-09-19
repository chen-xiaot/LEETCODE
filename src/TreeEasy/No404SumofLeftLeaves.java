package TreeEasy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class No404SumofLeftLeaves {

	public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        int sum = 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            if (cur.left != null) {
                if (cur.left.left == null && cur.left.right == null) {
                    sum += cur.left.val;
                } else {
                    stack.push(cur.left);
                }
            }
            if (cur.right != null) {
                if (cur.right.left != null || cur.right.right != null) // 可有可无，减少判断次数
                    stack.push(cur.right);
            }
        }
        return sum;
    }
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1); stack.push(2);
		for (int i : stack) {
			System.out.println(i);
		}
		
		Deque<Integer> queue = new LinkedList<>();
		queue.add(1);queue.add(2);
		for (int i : queue) {
			System.out.println(i);
		}
	}

}
