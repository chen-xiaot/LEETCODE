package StringEasy;

public class No205IsomorphicStrings {

	public boolean isIsomorphic(String s, String t) {
        int[] arrS = new int[256];   //length of ASCA II
        int[] arrT = new int[256];
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            if (arrS[s.charAt(i)] != arrT[t.charAt(i)]) return false;
            arrS[s.charAt(i)] = i + 1;
            arrT[t.charAt(i)] = i + 1;
        }
        return true;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
