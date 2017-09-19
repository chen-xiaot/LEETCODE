package Hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// computeIfAbsent 好用到飞起， 还有map.values()

public class No49GroupAnagrams {

	public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if (strs == null || strs.length == 0) return res;
        Map<String, List<String>> map = new HashMap<>();
        
        for (String str : strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            map.computeIfAbsent(key, k -> new ArrayList<String>()).add(str);
        }
        return new ArrayList<List<String>>(map.values());
    }
	
	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		list.add("leet"); list.add("code");
		
		System.out.println(list.contains("leet"));
		
	}

}
