class Solution {
    public void sortColors(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int ele : nums){
                map.put(ele,map.getOrDefault(ele,0) + 1);
        }
        int idx = 0;
        for(int i = 0;i<= 2;i++){
            int count = map.getOrDefault(i,0);
            for(int j = 0;j<count;j++){
                nums[idx++] = i;
            }
        }
    }
}
