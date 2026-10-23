class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        
        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
            start = Math.min(start,num);
            end = Math.max(end,num);
        }
        for(int i = start; i<end; i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}
