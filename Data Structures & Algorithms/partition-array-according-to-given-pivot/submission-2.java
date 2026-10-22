class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans = new int[nums.length];
        int l = 0, r = nums.length - 1;
        int l1 = 0, r1 = nums.length - 1;

        while(l < nums.length){
            if(nums[l] < pivot){
                ans[l1] = nums[l];
                l1 += 1;
            }
            if(nums[r] > pivot){
                ans[r1] = nums[r];
                r1 -= 1;
            }
            l += 1;
            r -= 1;
        }

        while(l1 <= r1){
            ans[l1] = pivot;
            l1 += 1;
        }

        return ans;
    }
}
