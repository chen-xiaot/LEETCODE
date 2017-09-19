package leetcode10;

//  original array [1,2,3,4,5,6,7] k=3
//           index  0 1 2 3 4 5 6
//                              arr.length-1
//                          arr.length-k  
//  result array   [5,6,7,1,2,3,4]

public class NO189RotateArray {
    public void rotate(int[] nums, int k) {
        int[] result=new int[nums.length];
        int index=0;
        k = k % nums.length;
        
        	for(int i=nums.length-k; i<nums.length; i++){
        		result[index]=nums[i];
        		index++;
        	}
        	for(int j=0;j<nums.length-k;j++){
        		result[index]=nums[j];
        		index++;
        	}
            for(int p=0;p<result.length;p++){
                System.out.println(result[p]);
            }
        }
    
    
	public static void main(String[] args) {
		NO189RotateArray tester=new NO189RotateArray();
		int[] nums=new int[]{1,2} ;int k=1;
		tester.rotate(nums, k);
	}
}
