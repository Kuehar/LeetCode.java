class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0;i<nums.length;i++){
            if (nums[i] >= target){
                return i;
            }
        }
        return nums.length;
    }
}

"""
Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
Memory Usage: 40.9 MB, less than 7.10% of Java online submissions for Search Insert Position.
"""
