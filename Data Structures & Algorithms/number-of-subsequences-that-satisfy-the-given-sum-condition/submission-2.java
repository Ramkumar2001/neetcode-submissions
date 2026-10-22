class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);

        int MOD = 1_000_000_007;
        long count = 0;
        long power = 1;

        int l = 0, r = nums.length - 1;

        while (l <= r) {
            if (nums[l] + nums[r] > target) {
                r--;
            } else {
                power = 1;
                for (int i = 0; i < r - l; i++) {
                    power = (power * 2) % MOD;
                }

                count = (count + power) % MOD;
                l++;
            }
        }

        return (int) count;
    }
}