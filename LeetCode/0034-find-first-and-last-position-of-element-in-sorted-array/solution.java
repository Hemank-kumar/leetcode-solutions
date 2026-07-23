class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int idx = -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                idx = mid;
                break;
            }else if(nums[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        if(idx == -1)return new int[]{-1,-1};

        int left = idx,right = idx;
        while(left > 0 && nums[left - 1] == target)left--;
        while(right < nums.length - 1 && nums[right + 1] == target)right++;
        return new int[]{left, right};
    }
}
