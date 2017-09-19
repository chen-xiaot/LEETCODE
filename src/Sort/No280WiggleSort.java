package Sort;

public class No280WiggleSort {

	public void wiggleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (i % 2 == 0) {
                if (nums[i] > nums[i + 1]) {
                    swap(nums, i, i + 1);
                }
            }
            else {
                if (nums[i] < nums[i + 1]) {
                    swap(nums, i, i + 1);
                }
            }
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
	
	public static void main(String[] args) {
		int[] nums = {2, 2, 3, 1, 5, 4};
		No280WiggleSort test = new No280WiggleSort();
		test.wiggleSort(nums);
		for (int i : nums) {
			System.out.print(i + " ");
		}
		
		
	}

}
