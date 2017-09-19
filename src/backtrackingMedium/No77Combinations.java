package backtrackingMedium;

import java.util.ArrayList;
import java.util.List;

public class No77Combinations {

	public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), n, k, 1);
        return res;
    }
    
    private void backtrack(List<List<Integer>> res, List<Integer> cur, int n, int k, int start) {
        if (cur.size() == k) {
            res.add(new ArrayList<>(cur));
            return;
        }
        for (int i = start; i <= n; i++) {
            cur.add(i);
            backtrack(res, cur, n, k, i + 1);
            cur.remove(cur.size() - 1);
        }
    } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
