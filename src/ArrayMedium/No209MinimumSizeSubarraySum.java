package ArrayMedium;

// similar to No 325 but different solution

public class No209MinimumSizeSubarraySum {

	public int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
		}
        
        int sum = 0, slow = 0, fast = 0, min = Integer.MAX_VALUE;
        
        while (fast < nums.length) {
            sum += nums[fast++];
            
            while (sum >= s) {
                min = Math.min(min, fast - slow);
                sum -= nums[slow++];
			}
		}
        return min == Integer.MAX_VALUE ? 0 : min;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
