import java.util.ArrayList;

class Solution {
    public int findUnsortedSubarray(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int max =  nums[0];
        int min = nums[nums.length - 1];
        int start = -1;
        int stop = -1;
        for(int i = nums.length-1;i >= 0;i--){
            if(nums[i] > min){
                start = i;
            }
            min = Math.min(min,nums[i]);
        }
        for(int i=0;nums.length>i;i++){
            if (nums[i] < max){
                stop = i;
            }
            max = Math.max(max,nums[i]); 
        }
        if(start == -1 || stop == -1){
            return 0;
        }
        return stop - start + 1;
    }
}
/*Runtime: 1 ms, faster than 100.00% of Java online submissions for Shortest Unsorted Continuous Subarray.
Memory Usage: 40.5 MB, less than 83.09% of Java online submissions for Shortest Unsorted Continuous Subarray.
*/
