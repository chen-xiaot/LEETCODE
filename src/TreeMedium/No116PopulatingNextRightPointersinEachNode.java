package TreeMedium;

class TreeLinkNode {
	      int val;
	      TreeLinkNode left, right, next;
	      TreeLinkNode(int x) { val = x; }
	  }

public class No116PopulatingNextRightPointersinEachNode {

	public void connect(TreeLinkNode root) {
        while (root != null) {
            TreeLinkNode cur = root;
            while (cur != null && cur.left != null) {
                cur.left.next = cur.right;
                cur.right.next = cur.next == null ? null : cur.next.left;
                cur = cur.next;
            }
            root = root.left;
        }
    }
	
	// root = 1, p = root = 1
//  2 -> 3
//  3 -> null
//  1 = 1.next = null
//  root = root.left = 2

//  root = 2, p = root = 2
//  4 -> 5
//  5 -> 2.next.left = 6
//  p = p.next = 3
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
