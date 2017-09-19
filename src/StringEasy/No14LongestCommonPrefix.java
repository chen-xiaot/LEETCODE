package StringEasy;

public class No14LongestCommonPrefix {

public String longestCommonPrefix(String[] strs) {
        
        if(strs==null||strs.length==0) return "";   //length  not length()
        
        String pre = strs[0];
        for(int i=1;i<=strs.length-1;i++){
            while(strs[i].indexOf(pre)!=0){
                pre=pre.substring(0,pre.length()-1);
            }
        }
        
        return pre;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
