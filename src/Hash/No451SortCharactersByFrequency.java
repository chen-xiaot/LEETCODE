package Hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class No451SortCharactersByFrequency {

	// Map<Character, Integer>

	// < t, 1>
	// < r, 1>
	// < e, 2>

	// bucket[1].add(t).add(r)
	// bucker[2].add(e)
	    
	    public String frequencySort(String s) {
	        if (s.length() == 0 || s == null) return "";
	        Map<Character, Integer> map = new HashMap<>();
	        for (char c : s.toCharArray()) {
	            map.put(c, map.getOrDefault(c, 0) + 1);
	        }
	        
	        List<Character> [] bucket = new List[s.length() + 1];
	        
	        for (char key : map.keySet()) {
	            int frequency = map.get(key);
	            if (bucket[frequency] == null) {
	                bucket[frequency] = new ArrayList<>();
	            }
	            bucket[frequency].add(key);
	        }
	        
	        StringBuilder sb = new StringBuilder();
	        for (int i = bucket.length - 1; i >= 0; i--) {
	            if (bucket[i] != null) {
	                for (char c : bucket[i]) {
	                    for (int j = 0; j < i; j++) {
	                        sb.append(c);
	                    }
	                }
	            }
	        }
	        return sb.toString();
	    }
	        
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
