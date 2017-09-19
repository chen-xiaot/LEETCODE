package ArrayMedium;

import java.util.HashMap;
import java.util.Map;

//similar to No 209 but different solution

public class No325MaximumSizeSubarraySumEqualsk {

	public int maxSubArrayLen(int[] nums, int k) {
        int sum = 0, max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            Integer value = map.get(sum - k);
            
            if (sum == k) {
                max = i + 1;
            } else if (value != null) {
                max = Math.max(max, i - value);
            }
            
            if (!map.containsKey(sum)) {
				map.put(sum, i);
            }
        }
        return max;
    }

	//[1, -1, 5, -2, 3], k = 3

	//return 4. (because the subarray [1, -1, 5, -2]

	//i = 0, sum = 1, map<1, 0>
	//i = 1, sum = 0, map<0, 1>
	//i = 2, sum = 5, map<5, 2>
	//i = 3, sum = 3, max = i + 1 = 4
//					map<3, 3>
	//i = 4, sum = 6, max = max(max, i - map.get(sum - k))
//						= 4
//					map<6, 4>
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
