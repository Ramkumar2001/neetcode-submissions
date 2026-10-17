class Solution {
    public int[] rearrangeArray(int[] nums) {
        // 3 1 -2 -5 2 -4
        int[] ans = new int[nums.length];
        int i = 0, j = 0, k = 0;;
        while(i < nums.length && j < nums.length){
          if(nums[i] < 0){
            i += 1;
            continue;
          }
          if(nums[j] > 0){
            j += 1;
            continue;
          }

          if(k%2 == 0){
            ans[k] = nums[i];
            i += 1;
          }
          else{
            ans[k] = nums[j];
            j += 1;
          }
          k += 1;
        }
        ans[k] = nums[j];

        return ans;
    }
}