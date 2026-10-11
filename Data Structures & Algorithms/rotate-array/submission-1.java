class Solution {
    public void rotate(int[] nums, int k) {
        //1 2 3 4 5 6 7 8
        //8 7 6 5 4 3 2 1
        k = k % nums.length;
        reverse(0, nums.length-1, nums);
        reverse(0, k-1, nums);
        reverse(k, nums.length-1, nums);
    }

    private void reverse(int i, int j, int[] nums){
        while (i < j){
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
            i += 1;
            j -= 1;
        }
    }
}