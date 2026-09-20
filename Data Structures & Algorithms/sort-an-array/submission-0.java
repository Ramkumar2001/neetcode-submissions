class Solution {
    public int[] sortArray(int[] nums) {
        for(int i = 0; i < nums.length; i += 1){
            for(int j = 0; j < nums.length - 1 - i; j += 1){
                if(nums[j] > nums[j+1]){
                    swap(j, j+1, nums);
                }
            }
        }
        return nums;
    }

    private void swap(int i, int j, int[] nums){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}