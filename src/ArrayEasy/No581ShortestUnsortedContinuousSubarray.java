package ArrayEasy;

public class No581ShortestUnsortedContinuousSubarray {

	public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int min = nums[n - 1], max = nums[0];
        int start = -1, end = -2;
        
        for (int i = 1; i < n; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[n - 1 - i]);
            if (nums[i] < max) end = i;
            if (nums[n - 1 - i] > min) start = n - 1 - i;
        }
        return end - start + 1;
    }
	
	// end 从左往右走，start从右往左走。
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
