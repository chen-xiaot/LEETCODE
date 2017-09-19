package ArrayEasy;

import java.util.HashMap;
import java.util.Map;

public class No219ContainsDuplicateII {

	public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
            
        for(int i=0;i<=nums.length-1; i++){
            if(map.containsKey(nums[i])){
                if((i-map.get(nums[i])<=k)){
                    return true;
                }
            }
            
            map.put(nums[i],i);
        }
        
        return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
