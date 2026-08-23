class Solution {
    public void nextPermutation(int[] nums) {
        int idx1 = -1, idx2 = -1;
        
        for(int i = nums.length - 2;i>=0;i--){
            if(nums[i] < nums[i + 1]){
                idx1 = i;
                break;
            }
        }

        if(idx1 == -1){
            int l = 0,r = nums.length-1;
            while(l < r){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r--;
            }
            return;
        }

        for(int i = nums.length - 1;i>=0;i--){
            if(nums[i] > nums[idx1]){
                idx2 = i;
                break;
            }
        }

        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;

        int l = idx1 + 1, r=nums.length-1;
        while(l < r){
            int temps = nums[l];
                nums[l] = nums[r];
                nums[r] = temps;
                l++;
                r--;
        }
        
   }
}
