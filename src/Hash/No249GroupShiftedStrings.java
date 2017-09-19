package Hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class No249GroupShiftedStrings {

	public List<List<String>> groupStrings(String[] strings) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        
        for (String str : strings) {
            int offset = str.charAt(0) - 'a';
            String key = "";
            for (int i = 0; i < str.length(); i++) {
                char c = (char) (str.charAt(i) - offset);
                if (c < 'a') {
                    c += 26;
                }
                key += c;
            }
            map.computeIfAbsent(key, k -> new ArrayList<String>()).add(str);
        }
        res.addAll(map.values()); // ! !
        return res;
    }
	
	// ["abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"]

	// [
	//   ["abc","bcd","xyz"],
	//   ["az","ba"],
	//   ["acef"],
	//   ["a","z"]
	// ]

	// s = abc 
	// offset = 'a' - 'a' = 0
	// key = ""

	// char c = 'a' - 0 = 'a'
	// char c = 'b' - 0 = 'b'
	// char c = 'c' - 0 = 'c'
	// key = 'abc'
	// map<abc, abc>

	// s = bcd
	// offset = 'b' - 'a' = 1

	// char c = 'b' - 1 = 'a'
	// char c = 'c' - 1 = 'b'
	// char c = 'd' - 1 = 'c'
	// key = 'abc'
	// map<abc, abc bcd>

	// s = az
	// offset = 'a' - 'a' = 0

	// char c = 'a' - 0 = 'a'
	// char c = 'z' - 0 = 'z'
	// key = 'az'
	// map<az, az>

	// s = ba
	// offset = 'b' - 'a' = 1

	// char c = 'b' - 1 = 'a'
	// char c = 'a' - 1 < 'a' + 26 = 'z'
	// key = 'az'
	// map<az, az ba>

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
