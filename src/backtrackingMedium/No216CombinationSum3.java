package backtrackingMedium;

import java.util.ArrayList;
import java.util.List;

public class No216CombinationSum3 {

	public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> cur = new ArrayList<Integer>();
        
        backtrack(res, cur, k, n, 1);
        
        return res;
    }
    
    private static void backtrack(List<List<Integer>> res, List<Integer> cur, int count, int target, int start){
        if(target < 0) return;
        else if(target == 0 && cur.size() == count){
            res.add(new ArrayList<>(cur));
        }
        else if(target > 0){
            for(int i = start; i<=9; i++){
                cur.add(i);
                backtrack(res, cur, count, target-i, i+1);
                cur.remove(cur.size()-1);
            }
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
