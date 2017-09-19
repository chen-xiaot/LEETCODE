package Hash;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class No554BrickWall {

	public int leastBricks(List<List<Integer>> wall) {
        if (wall.size() == 0) return 0;
        Map<Integer, Integer> map = new HashMap<>(); //HashMap stores the frequency of edges at different locations. The location with largest number of edges will have a vertical line cross the least number of braicks.
        int count = 0;
        
        for (List<Integer> list : wall) {
            int length = 0;
            for (int i = 0; i < list.size() - 1; i++) {
                length += list.get(i);
                map.put(length, map.getOrDefault(length, 0) + 1);
                count = Math.max(count, map.get(length));
            }
        }
        if (count == wall.size()) return 0;  // 这个并没有避免两边的最右边一列的特殊case啊。。。
        return wall.size() - count;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
