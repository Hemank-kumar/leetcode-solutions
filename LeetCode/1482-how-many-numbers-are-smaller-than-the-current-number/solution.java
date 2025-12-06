class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] freq = new int[101];  // Frequency array for numbers 0–100
        
        // Count frequencies
        for (int num : nums) {
            freq[num]++;
        }
        
        // Prefix sum: freq[i] = count of numbers < i
        for (int i = 1; i < 101; i++) {
            freq[i] += freq[i - 1];
        }
        
        int[] result = new int[nums.length];
        
        // Build the result array
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            result[i] = (num == 0) ? 0 : freq[num - 1];
        }
        
        return result;
    }
}

