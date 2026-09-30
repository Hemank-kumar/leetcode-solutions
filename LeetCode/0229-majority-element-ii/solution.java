class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> ls = new ArrayList<>();
        int maj = nums.length/3;
        for(int ele:nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
            if(map.get(ele)>maj && !ls.contains(ele)){
                ls.add(ele);
            }
        }
        return ls;
    }
}
