package backtrackingMedium;

import java.util.ArrayList;
import java.util.List;

public class No254FactorCombinations {

	public List<List<Integer>> getFactors(int n) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), n, 2);
        return res;
    }
    private void backtrack(List<List<Integer>> res, List<Integer> cur, int n, int start) {
        if (n <= 1) {
            if (cur.size() > 1) {
                res.add(new ArrayList<>(cur));
            }
            return;
        }
        
        for (int i = start; i <= n; i++) {
            if (n % i == 0) {
                cur.add(i);
                backtrack(res, cur, n / i, i);
                cur.remove(cur.size() - 1);
            }
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
