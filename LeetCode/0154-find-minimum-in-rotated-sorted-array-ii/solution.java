class Solution {
    public int findMin(int[] nums) {
        return search(nums,0,nums.length-1);
    }
    private int search(int[] nums, int left, int right){
        if(left == right){
            return nums[left];
        }
        int mid = left + (right - left) / 2;
        if(nums[mid] < nums[right]){
            return search(nums,left,mid);
        }else if(nums[mid] > nums[right]){
            return search(nums,mid + 1,right);
        }else{
            return search(nums,left,--right);
        }
    }
}
