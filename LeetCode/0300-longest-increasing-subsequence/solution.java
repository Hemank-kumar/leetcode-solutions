class Solution {
    public int lengthOfLIS(int[] nums) {
        List <Integer> ls = new ArrayList<>();
        int size=0;
        for(int num : nums){
            int left = 0;
            int right = size;
            while(left < right){
                int mid = left + (right-left)/2;
                if(ls.get(mid) < num){
                    left = mid + 1;
                }else{
                    right = mid;
                }
            }
            if (left == size) {
                ls.add(num);
                size++;
            } else {
                ls.set(left, num);
            }
        }
        return size;
    }
}
