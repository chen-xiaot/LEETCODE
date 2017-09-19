package ArrayMedium;

public class No80RemoveDuplicatesfromSortedArray2 {

	public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums) {
            if (i < 2 || n > nums[i - 2]) {
                nums[i++] = n; 
            }
        }
        return i;
    }
	
	// nums : 1 1 1 2 2 3
	// i = 0, n = 1
	// nums[0] = 1

	// i = 1, n = 1
	// nums[1] = 1

	// i = 2, n = 1
	// nothing

	// i = 2, n = 2
	// nums[2] = 2

	// i = 3, n = 2 
	// nums[3] = 2

	// i = 4, n = 3
	// nums[4] = 3

	// return i;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
