class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0, j = 0;
        while(j < nums.length && nums[j] == 0) j += 1;
        while(j < nums.length){
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
            i += 1;
            j += 1;
            while(j < nums.length && nums[j] == 0) j += 1;
        }
    }
}