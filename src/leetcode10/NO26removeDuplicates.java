package leetcode10;

//  we can keep two pointers---- i: the slow-runner, j: the fast-runner

public class NO26removeDuplicates {

	public int removeDuplicates(int[] nums) {
	    if (nums.length == 0) return 0;
	    int i = 0;
	    for (int j = 1; j < nums.length; j++) {
	        if (nums[j] != nums[i]) {
	            i++;
	            nums[i] = nums[j];
	        }
	    }
////////////////////////////////////////////	    
	    for(int k=0;k<nums.length;k++){
	    	System.out.println(nums[k]);
	    }
////////////////////////////////////////////	    
	    return i + 1;
	}
	
	public static void main(String[] args) {
		NO26removeDuplicates tester = new NO26removeDuplicates();
		int[] nums={1,1,2,2,2,3};
		tester.removeDuplicates(nums);
	}

}
