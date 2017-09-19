package Hash;

import java.util.HashMap;
import java.util.Map;

public class No525ContiguousArray {

	public int findMaxLength(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = -1;
            }
        }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0, max = 0;
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum)) {
                max = Math.max(max, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return max;
    }
	
	// [0, 1, 0, 1, 1, 0, 1]
	// [-1,1,-1, 1, 1,-1, 1]

	// 1.map<0 ,-1>
	//  sum = -1, map<-1, 0>

	// 2. sum = 0, max = 2

	// 3. sum = -1, max = 2

	// 4. sum = 0, max = 4

	// 5. sum = 1, map<1, 4>

	// 6. sum = 0, max = 6

	// 7. sum = 1, max = 2
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
