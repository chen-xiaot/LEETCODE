package backtrackingMedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No39CombinationSum {

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> cur = new ArrayList<Integer>();
        backtrack(candidates, target, 0, res, cur);
        return res;
    }
    
    private static void backtrack(int[] candidates, int target, int start, List<List<Integer>> res, List<Integer> cur){
        if(target == 0){
            res.add(new ArrayList<>(cur));
        }
        else if (target > 0){
            for(int i = start; i<candidates.length && target>= candidates[i]; i++){
                cur.add(candidates[i]);
                backtrack(candidates, target-candidates[i], i, res, cur);
                cur.remove(cur.size()-1);
            }
        }
    }
	
	public static void main(String[] args) {
		No39CombinationSum test = new No39CombinationSum();
		int[] candidates = {2,3,4};
		int target = 6;
		System.out.println(test.combinationSum(candidates, target));
		

	}

}
