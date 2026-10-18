class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0, j = nums.length - 1;
        while(i < j){
            if(nums[i] % 2 == 0){
                i += 1;
                continue;
            }
            if(nums[j] % 2 != 0){
                j -= 1;
                continue;
            }

            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
            i += 1;
            j -= 1;
        }

        return nums;
    }
}