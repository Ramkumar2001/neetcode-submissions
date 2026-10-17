class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int k = 0;
        int i = 0, j = nums.length - 1;
        while(i <= j){
            int sq1 = nums[i]*nums[i];
            int sq2 = nums[j]*nums[j];
            if(sq1 >= sq2){
                ans[k] = sq1;
                i += 1;
            }
            else{
                ans[k] = sq2;
                j -= 1;
            }
            k += 1;
        }

        i = 0; j = nums.length - 1;
        while(i < j){
            int tmp = ans[i];
            ans[i] = ans[j];
            ans[j] = tmp;
            i += 1; j -= 1;
        }

        return ans;
    }
}