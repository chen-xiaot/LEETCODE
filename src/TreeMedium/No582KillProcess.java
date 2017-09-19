package TreeMedium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class No582KillProcess {

	public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        Map<Integer, List<Integer>> adjacencyLists = new HashMap<>();

     for (int i = 0; i < ppid.size(); i++ ) {
         // getOrDefault(k, v) => counts.put(k, counts.getOrDefault(k, 0) + 1);
         adjacencyLists.computeIfAbsent(ppid.get(i), k -> new LinkedList<>()).add(pid.get(i));
     }
     
     List<Integer> res = new ArrayList<>();
     Queue<Integer> q = new LinkedList<>();
     q.add(kill);
     while (!q.isEmpty()) {
         int cur = q.poll();
         res.add(cur);
         List<Integer> children = adjacencyLists.get(cur);
         if (children == null) {
             continue;
         }
         q.addAll(children); // queue.addAll(List) ?
     }

     return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
