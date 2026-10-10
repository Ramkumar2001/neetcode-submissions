class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int runningSum = 0;
        int sol = 0;

        for(int n : nums){
            runningSum += n;
            if(runningSum == k) sol += 1;
            sol += map.getOrDefault(runningSum - k, 0);
            map.put(runningSum, map.getOrDefault(runningSum, 0) + 1);
        }

        return sol;
    }
}