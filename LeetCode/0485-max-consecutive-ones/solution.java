class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left = 0;
        int right = 0;
        int count = 0;
        while(right<nums.length){
            if(nums[right] == 1){
                right++;
            }else{
                count = Math.max(count, right-left );
                left = right + 1;
                right++;
            }
        }
        count = Math.max(count, right-left );
        return count;
    }
}
