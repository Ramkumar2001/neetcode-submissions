class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> sol = new ArrayList<>();
        int i = 0;
        //-2 0 0 2 2
        while(i < nums.length - 2){
            int target = -1*nums[i];
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k){
                int sum = nums[j] + nums[k];
                if(sum == target){
                    sol.add(List.of(nums[i], nums[j], nums[k]));
                    j += 1;
                    while(j < nums.length - 1 && nums[j] == nums[j-1]){
                        j += 1;
                    }
                    k -= 1;
                }
                else if(sum < target){
                    j += 1;
                }
                else{
                    k -= 1;
                }
            }
            i += 1;
            while(i > 0 && i < nums.length - 2 && nums[i] == nums[i-1]) i += 1;
        }

        return sol;
    }
}
