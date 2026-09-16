class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0, j = nums.length - 1, k = 0;

        while(i <= j){
            if(nums[i] == val){
                k += 1;
                nums[i] = nums[j];
                nums[j] = val;
                j -= 1;
            }
            else{
                i += 1;
            }
        }

        return nums.length - k;
    }
}