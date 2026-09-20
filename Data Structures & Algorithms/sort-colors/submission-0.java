class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int i = 0;

        while(i <= end){
            if(nums[i] == 0){
                swap(start, i, nums);
                start += 1;
                i += 1;
            }
            else if(nums[i] == 2){
                swap(end, i, nums);
                end -= 1;
            }
            else{
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