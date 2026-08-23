class Solution {
    public int trap(int[] height) {
            int len = height.length;
          int leftMax = 0,rightMax = 0;
          int l = 0,r = len-1;  
          int water = 0;
          while(l<r){
            if(height[l] <= height[r]){
                if(height[l] > leftMax){
                    leftMax = height[l];
                }else{
                    water += leftMax - height[l];
                }
                l++;
            }else{
                if(height[r] > rightMax){
                    rightMax = height[r];
                }else{
                    water += rightMax - height[r];
                }
                r--;
            }
          }
          return water;
    }
}
