package DPMedium;

public class No213HouseRobber2 {

	public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        return Math.max(robRange(nums, 0, nums.length - 2), robRange(nums, 1, nums.length - 1));
    }
    
    private static int robRange(int[] nums, int start, int end) {
        int no = 0;
        int yes = 0;
        for (int i = start; i <= end; i++) {
            int temp = no;
            no = Math.max(no, yes);
            yes = nums[i] + temp;
        }
        return Math.max(no, yes);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
