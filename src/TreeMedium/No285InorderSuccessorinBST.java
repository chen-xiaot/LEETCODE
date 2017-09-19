package TreeMedium;

public class No285InorderSuccessorinBST {

	public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode cur = null;
        while (root != null) {
            if (p.val < root.val) {
                cur = root;
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return cur;
    }
	
//  5 
// /  \
//2    7 
/// \  / \
//1  3 6   8 

//indorder: 
//1 2 3 5 6 7 8

//1: given 6, return 7
//root = 5
//root = 7
//cur = root = 7,
//root = root.left = 6
//root = root.right = null
//return cur = 7

//2: given 1, return 2
//root = 5
//cur = 5, root = root.left = 2
//cur = 2, root = root.left = 1
//root = root.right = null
//return cur = 2
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
