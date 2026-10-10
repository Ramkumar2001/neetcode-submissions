class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int i = 0; i < nums.length; i += 1){
            nums[i] = Math.max(nums[i], 0);
        }

        for(int i = 0; i < nums.length; i += 1){
            int absValue = Math.abs(nums[i]);
            int index = absValue - 1;
            if(index < 0 || index >= nums.length || nums[index] < 0) continue;

            if(nums[index] == 0){
                nums[index] = -1 * (index + 1);
            }
            else{
                nums[index] = -1 * nums[index];
            }
        }

        for(int i = 1; i <= nums.length; i += 1){
            if(nums[i-1] >= 0) return i;
        }

        return nums.length + 1;
    }
}