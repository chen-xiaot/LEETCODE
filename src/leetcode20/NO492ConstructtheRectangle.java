package leetcode20;

public class NO492ConstructtheRectangle {

	public int[] constructRectangle(int area) {
        if(area==0) return new int[]{-1,-1};
        
        int half=0;
        half=(int)Math.sqrt(area);
        while(area%half != 0){
            half--;
        }
        int length=area/half;
        
        return new int[]{length,half};
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
