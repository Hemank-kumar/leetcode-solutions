class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int left = 0;
        int right = 0;
        for(int w : weights){
            left = Math.max(left, w);
            right += w;
        }

        
        while(left < right){
            int mid = left + (right - left)/2;
            if(canDeliver(weights, days, mid)){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean canDeliver(int[] weight, int days, int capacity){
        int req = 1;
        int currWeight = 0;

        for(int w : weight){
            if((currWeight + w) > capacity){
                currWeight = 0;
                req++;
            }
            currWeight += w;
        }
        return req <= days;
    }
}
