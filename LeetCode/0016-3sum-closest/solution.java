class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length;
        int closestSum = nums[0] + nums[1] + nums[2];
        for(int i = 0;i<nums.length;i++){
            int left = i+1,right = len - 1;
            
            while(left < right){
                int currentSum = nums[i] + nums[left] + nums[right];
                if(Math.abs(target - closestSum) > Math.abs(target - currentSum)){
                    closestSum = currentSum;
                }

                if(currentSum < target){
                    left++;
                }
                else if(currentSum > target){
                    right--;
                }else{
                    return currentSum;
                }

            }
        }
        return closestSum;
    }
}
