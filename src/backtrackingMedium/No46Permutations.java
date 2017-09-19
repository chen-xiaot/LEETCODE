package backtrackingMedium;

import java.util.ArrayList;
import java.util.List;


public class No46Permutations {

	public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), nums);
        return res;
    }
    
    private void backtrack(List<List<Integer>> res, List<Integer> cur, int[] nums) {
        if (cur.size() == nums.length) res.add(new ArrayList<>(cur));
        else {
            for (int i = 0; i < nums.length; i++) {
                if (cur.contains(nums[i])) continue;
                cur.add(nums[i]);
                backtrack(res, cur, nums);
                cur.remove(cur.size() - 1);
            }
        }
    }
	
	public static void main(String[] args) {


	}

}
