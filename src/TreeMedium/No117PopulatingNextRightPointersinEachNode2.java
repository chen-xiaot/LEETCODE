package TreeMedium;

public class No117PopulatingNextRightPointersinEachNode2 {

	public void connect(TreeLinkNode root) {
        TreeLinkNode dummy = new TreeLinkNode(0);
        TreeLinkNode cur;
        while (root != null) {
            cur = dummy;
            while (root != null) {
                if (root.left != null) {
                    cur.next = root.left;
                    cur = cur.next;
                }
                if (root.right != null) {
                    cur.next = root.right;
                    cur = cur.next;
                }
                root = root.next;
            }
            root = dummy.next;
            dummy.next = null;
        }
    }
	
//	1 -> NULL
//  /  \
// 2 -> 3 -> NULL
/// \    \
//4-> 5 -> 7 -> NULL

//tempChild : 0

//currentChild : 0
//root = 1
//0 -> 2, currentChild : 2
//2 -> 3, currentChild : 3

//root = 2 , tempChild.next = null
//currentChild : 0
//0 -> 4, currentChild : 4
//4 -> 5, currentChild : 5
//root = 3
//5 -> 7, currentChild : 7
//root = 4, tempChild.next = null
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
