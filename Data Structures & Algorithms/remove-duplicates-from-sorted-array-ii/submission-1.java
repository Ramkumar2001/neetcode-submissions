class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 2;
        // 1 1 1 2 2 3
        // 1 1 2 2 2 3
        for(int j = 2; j < nums.length; j += 1){
            if(nums[j] != nums[i-2]){
                nums[i++] = nums[j];
            }
        }

        return i;

    }
}