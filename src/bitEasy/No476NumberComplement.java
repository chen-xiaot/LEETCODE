package bitEasy;

public class No476NumberComplement {

	public int findComplement(int num) {
        int target = 0, index = 0;
        
        while(target < num){
            target = target + (int)Math.pow(2,index);
            index ++;
        }
        
        return target-num;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((char)(106));
	}

}
