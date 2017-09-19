package leetcode10;

public class NO344ReverseString {
	
    public String reverseString(String s) {
        
        char[] charArr= s.toCharArray();
        swapChar(charArr);
        return String.valueOf(charArr);   //can not be charArr.toString();
    }
    
    public void swapChar(char[] charArr){
        int i = 0;
        int j = charArr.length-1;
        char temp;
        while(i<j){
            temp=charArr[i];
            charArr[i]=charArr[j];
            charArr[j]=temp;
            i++;
            j--;
        }
        return;
    }
	public static void main(String[] args) {
		NO344ReverseString tester=new NO344ReverseString();
		String result = tester.reverseString("hello java and js");
		System.out.println(result);
	}

}
