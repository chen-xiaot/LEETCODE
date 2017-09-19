package leetcode10;

public class NO283MoveZeroes {
	
	public void moveZeroes(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){                       // error if using while
                nums[index]= nums[i];
                index++;
            }
        }

        while(index<=nums.length-1){		// error  index <= nums.length
        	nums[index]=0;
        	index++;
        }
        
  
        
        for(int k=0;k<nums.length;k++){
        	System.out.println(nums[k]);
        }
    }
	
	public static void main(String[] args) {
		int[] nums =new int[]{0,1,0,3,12};
		NO283MoveZeroes tester = new NO283MoveZeroes();
		tester.moveZeroes(nums);

	}

}
