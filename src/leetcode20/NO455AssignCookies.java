package leetcode20;

import java.util.Arrays;

public class NO455AssignCookies {
	
public int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g); Arrays.sort(s);
        int ptrg=0, ptrs=0;
        
        while(ptrg<g.length && ptrs<s.length){
            if(g[ptrg]<=s[ptrs]){
                ptrg++;
                ptrs++;
            }
            else ptrs++;
        }
        
        return ptrg;
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
