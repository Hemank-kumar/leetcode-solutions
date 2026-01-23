class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0]=findFirst(nums,target);
        result[1]=findLast(nums,target);
        return result;
    }

    public static int findFirst(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int mid = start + (end - start)/2;
        int ans = -1;

        while(start <= end){
            if(nums[mid] == target ){
                ans = mid;
                end = mid-1;
            }else if(nums[mid] > target){
                end = mid - 1;
            }else if(nums[mid] < target){
                start = mid + 1;
            }
            mid = start + (end - start)/2;
        }
        return ans;
    }

    public static int findLast(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int mid = start + (end - start)/2;
        int ans = -1;

        while(start <= end){
            mid = start + (end - start)/2;
            if(nums[mid] == target){
                ans = mid;
                start = mid + 1;
            }else if(nums[mid] > target){
                end = mid - 1;
            }else if(nums[mid] < target){
                start = mid + 1;
            }
            mid = start + (end - start)/2;
        }
        return ans;
    }
}
