package ArrayEasy;

import java.util.ArrayList;
import java.util.List;

public class No448FindAllNumbersDisappearedinanArray {

public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0;i<=nums.length-1;i++){
            int index = Math.abs(nums[i])-1;
            if(nums[index]>0){
            nums[index] = -nums[index];
            }
        }
        
        for(int j=0;j<=nums.length-1;j++){
            if(nums[j]>=0){
                list.add(j+1);
            }
        }
        
        return list;
        
    }
	
	public static void main(String[] args) {
		No448FindAllNumbersDisappearedinanArray test = new No448FindAllNumbersDisappearedinanArray();
		int[] nums = {4,3,2,7,8,2,3,1};
		test.findDisappearedNumbers(nums);

	}

}
