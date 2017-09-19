package StringMedium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class No127WordLadder {

	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> beginSet = new HashSet<>(), endSet = new HashSet<>(), visited = new HashSet<>();
        int len = 1;
        
        beginSet.add(beginWord); endSet.add(endWord);
        
        while (!beginSet.isEmpty() && !endSet.isEmpty()) {
		    if (beginSet.size() > endSet.size()) {  // ???这到底干嘛用的
			    Set<String> set = beginSet;
			    beginSet = endSet;
			    endSet = set;
		    }
		    
		    Set<String> temp = new HashSet<>();
		    for (String word : beginSet) {  //每次的beginSet都是上一次的temp set，只有一个word，如果有add的话
			    char[] chs = word.toCharArray();
			    
			    for (int i = 0; i < chs.length; i++) {
				    for (char c = 'a'; c <= 'z'; c++) {
					    char old = chs[i];
					    chs[i] = c;
					    String target = String.valueOf(chs);

					    if (endSet.contains(target)) {
						    return len + 1;
					    }

					    if (!visited.contains(target) && wordList.contains(target)) {
						    temp.add(target);
						    visited.add(target);
					    }
					    chs[i] = old;
				    }
			    }
		    }
		    beginSet = temp;
		    len++;
	    }
        return 0;
    }
	
	public static void main(String[] args) {
		String beginWord = "hit";
		String endWord = "cog";
		List<String> wordList = new ArrayList<>();
		wordList.add("hot");wordList.add("dot");wordList.add("dog");
		wordList.add("lot");wordList.add("log");
		
		No127WordLadder test = new No127WordLadder();
		System.out.println(test.ladderLength(beginWord, endWord, wordList));

	}

}
