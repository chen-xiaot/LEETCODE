package leetcode10;

import java.util.HashMap;
import java.util.Map;
//  Map<Integer, Integer> map=new HashMap<>();
//  map.put(value,index),    map.containsKey(value),   map.get(value)

public class NO2TwoSum {
	
	public int[] twoSum(int[] arr, int target){
		Map<Integer, Integer> map=new HashMap<>();
		for (int i=0; i<arr.length; i++){
			map.put(arr[i],i);
		}
		
		for (int i=0; i<arr.length; i++){
			int complement=target-arr[i];
			if(map.containsKey(complement)&&map.get(complement)!=i){
				return new int[]{i,map.get(complement)};
			}
		}
		return new int[]{-1};
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
