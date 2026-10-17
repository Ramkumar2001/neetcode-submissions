class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> sol = new ArrayList<>();
        Arrays.sort(nums);
        //-2 -1 0 0 1 2
        int p = 0;
        while(p < nums.length - 3){
            int q = p + 1;
            while(q < nums.length - 2){
                int r = q + 1;
                int s = nums.length - 1;
                while(r < s){
                    long sum = (long)nums[p] + nums[q] + nums[r] + nums[s];
                    if(sum == target){
                        sol.add(List.of(nums[p], nums[q], nums[r], nums[s]));
                        r += 1;
                        while(r < nums.length && nums[r] == nums[r-1]) r += 1;
                        s -= 1;
                    }
                    else if(sum > target){
                        s -= 1;
                    }
                    else{
                        r += 1;
                    }
                }
                q += 1;
                while(q < nums.length && nums[q] == nums[q-1]) q += 1;
            }
            p += 1;
            while(p < nums.length && nums[p] == nums[p-1]) p += 1;
        }

        return sol;
    }
}