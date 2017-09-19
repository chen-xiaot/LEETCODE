package LinkedListMedium;

class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
}

public class No109ConvertSortedListtoBinarySearchTree {
	
	public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        return convertBST(head, null);
    }
    private TreeNode convertBST(ListNode head, ListNode tail) {
        if(head==tail) return null;
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != tail && fast.next != tail) {
            fast = fast.next.next;
            slow = slow.next;
        }
        TreeNode root = new TreeNode(slow.val);
        root.left = convertBST(head, slow);
        root.right = convertBST(slow.next, tail);
        return root;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
