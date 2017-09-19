package backtrackingMedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No47Permutations2 {

	public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(res, new ArrayList<>(), nums, new boolean[nums.length]);
        return res;
    }
    
    private void backtrack(List<List<Integer>> res, List<Integer> cur, int [] nums, boolean [] used) {
        if (cur.size() == nums.length) {
            res.add(new ArrayList<>(cur));
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i] || i > 0 && nums[i] == nums[i-1] && !used[i - 1]) continue;
            used[i] = true;
            cur.add(nums[i]);
            backtrack(res, cur, nums, used);
            used[i] = false;
            cur.remove(cur.size() - 1);
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
