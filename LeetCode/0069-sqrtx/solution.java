class Solution {
    public int mySqrt(int x) {
        int start = 0;
        int end = x;
        int mid ;
        int ans = 0;
        while(start <= end){
            mid = start + (end-start)/2;
            long sq = (long) mid * mid;
            
            if(sq < x){
                ans = mid;
                start = mid+1;
            }else if(sq > x){
                end = mid-1;
            }else if(sq == x){
                return mid;
            }
        }
        return ans;
    }
}
