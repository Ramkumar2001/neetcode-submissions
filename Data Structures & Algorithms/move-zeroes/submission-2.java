class Solution {
    public void moveZeroes(int[] nums) {
        //0 0 1 2 0 5
        int i = 0;
        for(int j = 0; j < nums.length; j += 1){
            if(nums[j] == 0) continue;
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
            i += 1;
        }
    }
}