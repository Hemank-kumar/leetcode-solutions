class Solution {
    public boolean isPerfectSquare(int num) {
        int l = 0;
        int h = num;
        while(l <= h){
            int mid = l + ( h - l)/2;
            long sq = (long) mid*mid;
            if(sq == num){
                return true;
            }else if(sq >= num){
                h = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return false;
    }
}
