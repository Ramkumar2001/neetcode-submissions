class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int right = nums.length - 1;
        int i = 0;

        while (i <= right){
            if(nums[i] == 0){
                swap(i, start, nums);
                start += 1;
                i += 1;
            }
            else if(nums[i] == 2){
                swap(i, right, nums);
                right -= 1;
                // we don't move after this swap because what if a 0 was swapped to i
            }
            else {
                i += 1;
            }
        }
    }

    private void swap(int i, int j, int[] nums){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}