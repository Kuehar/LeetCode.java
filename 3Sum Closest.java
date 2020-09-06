class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[nums.length - 1];
        for (int i = 0; i < nums.length - 2; i++) {
            int low = i + 1, high = nums.length - 1;
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if (sum == target) return sum;
                else if (sum < target) low++;
                else high--;
                if (Math.abs(sum - target) < Math.abs(result - target)) result = sum;
            }
        }
        return result;
    }
}

"Runtime: 4 ms, faster than 90.74% of Java online submissions for 3Sum Closest."
"Memory Usage: 39.2 MB, less than 61.67% of Java online submissions for 3Sum Closest."
