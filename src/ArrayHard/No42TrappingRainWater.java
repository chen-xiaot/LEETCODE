package ArrayHard;

public class No42TrappingRainWater {

	public int trap(int[] height) {
        if (height == null || height.length == 0) return 0;
        int left = 0, right = height.length - 1;
        int maxLeft = 0, maxRight = 0;
        int res = 0;
        
        while (left <= right) {
            if (height[left] <= height[right]) {
                if (height[left] >= maxLeft) {
                    maxLeft = height[left];
                } else {
                    res += maxLeft - height[left];
                }
                left++;
            } 
            else { //height[left] > height[right]
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                } else {
                    res += maxRight - height[right];
                }
                right--;
            }
        }
        return res;
    }

	// 1.[left] = 0, [right] = 1
//  maxleft = 0, left++;

//2.[left] = 1, [right] = 1
//  maxleft = 1, left++;

//3.[left] = 0, [right] = 1
//  res = maxleft - [left] = 1, left++;

//4.[left] = 2, [right] = 1
//  maxright = 1, right--;

//5.[left] = 2, [right] = 2
//  maxleft = 2, left++;

//6.[left] = 1, [right] = 2
//  res += 1 = 2, left ++

//7 [left] = 0, [right] = 2
//  res += 2 = 4, left ++

//8 [left] = 1, [right] = 2
//  res += 1 = 5, left ++

//9 [left] = 3, [right] = 2
//  maxright = 2, right--

//10 [left] = 3, [right] = 1
//  res += 1 = 6, right--

//11 [left] = 3, [right] = 2
//   right --

//12 [left] = 3, [right] = 3
//   left ++
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
