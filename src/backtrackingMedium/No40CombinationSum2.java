package backtrackingMedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No40CombinationSum2 {

	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
	    
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> cur = new ArrayList<Integer>();
        
        backtrack(candidates, target, 0, res, cur);
        
        return res;
    }
    
    private static void backtrack(int[] candidates, int target, int start, List<List<Integer>> res, List<Integer> cur){
        if(target<0) return;
        else if(target == 0){
            res.add(new ArrayList<>(cur));
        }
        else if(target > 0){
            for(int i = start; i<candidates.length; i++){
                if(i>start && candidates[i]==candidates[i-1]) continue;
                cur.add(candidates[i]);
                backtrack(candidates, target-candidates[i], i+1, res, cur);
                cur.remove(cur.size()-1);
            }
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
