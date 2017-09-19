package TreeMedium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class No508MostFrequentSubtreeSum {

	Map<Integer, Integer> map = new HashMap<>();
    int maxCount = 0;
    
    public int[] findFrequentTreeSum(TreeNode root) {
        postorder(root);
        
        List<Integer> list = new ArrayList<>();
        for (int key : map.keySet()) {
            if (map.get(key) == maxCount) {
                list.add(key);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
    
    private int postorder(TreeNode root) {
        if (root == null) return 0;
        
        int left = postorder(root.left);
        int right = postorder(root.right);
        int sum = left + right + root.val;
        int count = map.getOrDefault(sum, 0) + 1;
        map.put(sum, count);
        maxCount = Math.max(count, maxCount);
        return sum;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
