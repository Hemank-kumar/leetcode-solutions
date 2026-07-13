class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int key:nums){
           
            map.put(key,map.getOrDefault(key,0) + 1);
        }
        int[] maxArr = new int[k];
        for(int i = 0;i<k;i++){
            int maxVal = -1;
            int maxKey = -1;
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                if(entry.getValue() > maxVal){
                    maxVal = entry.getValue();
                    maxKey = entry.getKey();
                }

            }
                        maxArr[i] = maxKey;
                map.put(maxKey,0);
        }
        return maxArr;
    }
}
