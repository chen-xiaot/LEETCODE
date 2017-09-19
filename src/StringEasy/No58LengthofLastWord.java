package StringEasy;

public class No58LengthofLastWord {

public int lengthOfLastWord(String s) {
        
        s=s.trim();
        int index = s.lastIndexOf(' ');
        return s.length()-1-index;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
