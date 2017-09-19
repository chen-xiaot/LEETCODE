package StringEasy;

public class No434NumberofSegmentsinaString {

	public int countSegments(String s) {
        int count=0;
        
        for(int i=0;i<=s.length()-1;i++){
            if(s.charAt(i)!=' ' && (i==0||s.charAt(i-1) == ' ')){
                count++;
            }
        }
        return count;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
