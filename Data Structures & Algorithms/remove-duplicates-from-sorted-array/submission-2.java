class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 0; j < nums.length; j += 1){
            if(nums[j] == nums[i]) continue;
            i += 1;
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        return i + 1;
    }
}