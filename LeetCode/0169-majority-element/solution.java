class Solution {
    public int majorityElement(int[] nums) {
        int element=0;
        int count = 0;
        for(int ele:nums){
            if(count == 0){
                element = ele;
            }
            
            count += (ele==element) ? 1 : -1;
            
        }
        return element;
    }
}
