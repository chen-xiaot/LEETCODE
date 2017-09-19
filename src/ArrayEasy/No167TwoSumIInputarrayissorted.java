package ArrayEasy;

public class No167TwoSumIInputarrayissorted {

	public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int left = 0, right = numbers.length-1;
        
        if(numbers[left]>target) return new int[]{-1,-1};
        
        while(left<right){
            if(numbers[left]+numbers[right]==target){
                res[0]=left+1; //!!
                res[1]=right+1; //!!
                return res;
            }
            
            else if (numbers[left]+numbers[right]<target){
                left ++;
            }
            
            else if(numbers[left]+numbers[right]>target){
                right--;
            }
        }
        
        return res;
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
