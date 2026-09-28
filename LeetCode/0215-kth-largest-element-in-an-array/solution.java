import java.util.Random;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        int target = nums.length - k;
        return quickSelect(nums, 0, nums.length - 1, target);
    }

    private int quickSelect(int[] nums, int left, int right, int target) {
        if (left >= right) return nums[left];

        int pivotIndex = left + new Random().nextInt(right - left + 1);
        int pivotValue = nums[pivotIndex];

        // 3-way partition
        int lt = left;      // nums[left...lt-1] < pivotValue
        int i = left;       // nums[lt...i-1] == pivotValue
        int gt = right;     // nums[gt+1...right] > pivotValue

        while (i <= gt) {
            if (nums[i] < pivotValue) {
                swap(nums, lt++, i++);
            } else if (nums[i] > pivotValue) {
                swap(nums, i, gt--);
            } else {
                i++;
            }
        }

        // Target falls inside the equal-to-pivot range
        if (target >= lt && target <= gt) {
            return nums[target];
        } else if (target < lt) {
            return quickSelect(nums, left, lt - 1, target);
        } else {
            return quickSelect(nums, gt + 1, right, target);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
