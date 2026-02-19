class Solution {
    public int arrangeCoins(int n) {
        long l = 1;
        long u = n;
        long mid = 0;
        while(l <= u){
            mid = l + (u - l)/2;
            long reqCoins = mid * (mid + 1)/2;
            if(reqCoins == n){
                return (int) mid;
            }else if(reqCoins > n){
                u = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return (int) u;
    }
}
