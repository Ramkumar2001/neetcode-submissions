class Solution {
    public void sortColors(int[] nums) {
        //pass 1
        int left = 0;
        for(int i = 0; i < nums.length; i += 1){
            if(nums[i] == 0){
                swap(left, i, nums);
                left += 1;
            }
        }
        //pass 2
        int leftOne = left;
        for(int i = left; i < nums.length; i += 1){
            if(nums[i] == 1){
                swap(leftOne, i, nums);
                leftOne += 1;
            }
        }
    }

    private void swap(int i, int j, int[] nums){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}