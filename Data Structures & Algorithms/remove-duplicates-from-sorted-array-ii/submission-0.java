class Solution {
    public int removeDuplicates(int[] nums) {
        //1 1 1 1 2 2 2 3
        int i = 0, j = 0, k = 0;
        for(j=0; j < nums.length; j += 1){
            if(nums[j] == nums[i]) continue;
            nums[k++] = nums[i];
            if(j - i > 1){
                nums[k++] = nums[i];
            }
            i = j;
        }

        nums[k++] = nums[i];
        if(j - i > 1){
            nums[k++] = nums[i];
        }

        return k;
    }
}