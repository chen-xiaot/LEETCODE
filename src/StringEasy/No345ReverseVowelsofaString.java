package StringEasy;

public class No345ReverseVowelsofaString {

	public String reverseVowels(String s) {
        int left = 0 , right = s.length()-1;
        String vowel = "aeiouAEIOU";
        char[] ch = s.toCharArray();
        while(left<right){
            if (vowel.contains(ch[left]+"") && vowel.contains(ch[right]+"")){
                char temp = ch[left];
                ch[left]=ch[right];
                ch[right]=temp;
                left++;
                right--;
            }
            else if (!vowel.contains(ch[left]+"")){
                left++;
            }
            else if(!vowel.contains(ch[right]+"")){
                right--;
            }
            
        }
        return String.valueOf(ch);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
