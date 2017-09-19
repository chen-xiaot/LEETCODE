package leetcode10;

// substring(start, end)     .chatAt   String[]

public class NO14longestCommonPrefix {

	public String longestCommonPrefix(String[] strs){
		
		if (strs == null || strs.length == 0) return "";    //????????????????????
		
		for(int i=0; i<strs[0].length();i++){
			char prefix=strs[0].charAt(i);
			
				for(int j=1;j<strs.length;j++){
					if(strs[j].length()==i||strs[j].charAt(i)!=prefix){   //????????????????????
						return strs[0].substring(0, i);
					}
				}
		}	
		return strs[0];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
