class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int i = 0; i < nums.length; i += 1){
            if(nums[i] <= 0 || nums[i] > nums.length){
                nums[i] = nums.length + 1 ;
            }
        }


        for(int i = 0; i < nums.length; i += 1){
            int absValue = Math.abs(nums[i]);
            int index = absValue - 1;
            if(index >= nums.length || nums[index] < 0) continue;
            nums[index] = -1 * nums[index];
        }

        for(int i = 1; i < nums.length + 1; i += 1){
            if(nums[i-1] >= 0) return i;
        }

        return nums.length + 1;
    }
}