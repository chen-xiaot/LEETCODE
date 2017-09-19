package ArrayEasy;

public class No66PlusOne {

public int[] plusOne(int[] digits) {
        
        for(int i=digits.length-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            
            digits[i]=0;
        }
        
        int[] res = new int[digits.length+1];
        res[0]=1;
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
