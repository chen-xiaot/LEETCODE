package StringMedium;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class No71SimplifyPath {

	public String simplifyPath(String path) {
        Set<String> skip = new HashSet<>(Arrays.asList("..",".",""));
        Deque<String> queue = new LinkedList<>();  //用stack或者queue的话，最后输出的顺序会反
                                                  //case : input : "/abc/...", expected: "/abc/..."
        for (String str : path.split("/")) {
            if (!queue.isEmpty() && str.equals("..")) {
                queue.pop();
            }
            else if (!skip.contains(str)) {
                queue.push(str);
            }
        }
        String res = "";
        for (String str : queue) {
            res = "/" + str + res;
        }
        return res.isEmpty() ? "/" : res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
