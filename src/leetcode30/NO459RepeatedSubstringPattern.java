package leetcode30;

public class NO459RepeatedSubstringPattern {
	
	
    public boolean repeatedSubstringPattern(String s) {
        for(int i=s.length()/2;i>=1;i--){
            if(s.length() % i ==0){
                int times = s.length()/i;
                String sub = s.substring(0,i);
                StringBuilder builder = new StringBuilder();
                for(int j=0;j<times;j++){
                    builder.append(sub);
                }
                if(builder.toString().equals(s)) return true;
            }
        }
        
        return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
