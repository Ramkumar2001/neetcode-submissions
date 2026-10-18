class Solution {
    public int[] sortArrayByParity(int[] nums) {
        //3 1 2 4
        int i = 0, j = nums.length - 1;
        while(i < j){
            if(nums[i] % 2 != 0){
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                j -= 1;
            }
            else if(nums[j] % 2 == 0){
                int tmp = nums[j];
                nums[j] = nums[i];
                nums[i] = tmp;
                i += 1;
            }
            else{
                i += 1;
                j -= 1;
            }
        }

        return nums;
    }
}