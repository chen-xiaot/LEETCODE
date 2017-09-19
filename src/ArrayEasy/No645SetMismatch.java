package ArrayEasy;

import java.util.HashSet;
import java.util.Set;

public class No645SetMismatch {

	public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int duplicate = 0, len = nums.length;
        long sum = (len * (len + 1)) / 2;
        for (int n : nums) {
            if (set.contains(n)) {
                duplicate = n;
            }
            sum -= n;
            set.add(n);
        }
        return new int[] {duplicate, (int) sum + duplicate};
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
