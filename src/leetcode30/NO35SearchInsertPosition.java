package leetcode30;

public class NO35SearchInsertPosition {

	 public int searchInsert(int[] nums, int target) {
		    int low = 0, high = nums.length;
		    while(low < high) {
		        int mid = low + (high - low) / 2;
		        if(nums[mid] < target)
		            low = mid + 1;
		        else
		            high = mid;
		    }
		    return low;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
