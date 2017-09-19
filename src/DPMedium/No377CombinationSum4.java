package DPMedium;

import java.util.Arrays;

public class No377CombinationSum4 {

	public int combinationSum4(int[] nums, int target) {
        if(nums.length == 0) return 0;
        int[] res = new int[target + 1];
        res[0] = 1;
        Arrays.sort(nums);
        
        for(int i = nums[0]; i < res.length; i++) {
            for(int item : nums){
                if(item > i) break;
                res[i] += res[i-item];
            }
        }
        
        return res[target];
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
