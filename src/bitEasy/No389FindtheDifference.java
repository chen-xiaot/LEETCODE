package bitEasy;

public class No389FindtheDifference {

	public char findTheDifference(String s, String t) {
        int res = 0;
        for(int i =0; i<= t.length()-1; i++){
            res += (int) t.charAt(i);
        }
        for(int i =0; i<= s.length()-1; i++){
            res -= (int) s.charAt(i);
        }
        return (char) res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
