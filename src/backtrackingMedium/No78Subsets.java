package backtrackingMedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No78Subsets {

	public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backtracking(res, new ArrayList<>(), nums, 0);
        return res;
    }
    
    private void backtracking(List<List<Integer>> res, List<Integer> cur, int[] nums, int start) {
        res.add(new ArrayList<>(cur));
        
        for (int i = start; i < nums.length; i++) {
            cur.add(nums[i]);
            backtracking(res, cur, nums, i + 1);
            cur.remove(cur.size() - 1);
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
