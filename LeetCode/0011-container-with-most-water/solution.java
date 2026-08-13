class Solution {
    public int maxArea(int[] height) {
        int left = 0,right =height.length-1;
        int maxArea = 0;
        while(left < right){
            int cbreadth = right - left;
            int clength = Math.min(height[left], height[right]);
            int area = clength * cbreadth;
            maxArea = Math.max(maxArea, area);
            if(height[left] < height[right]) left++;
            else right--;
        }
        return maxArea;
    }
}
