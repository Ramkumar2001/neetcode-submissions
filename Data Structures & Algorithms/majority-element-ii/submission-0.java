class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int threshold = nums.length/3;

        for(int n:nums){
            map.put(n, map.getOrDefault(n,0) + 1);
        }

        List<Integer> ans = new ArrayList<>();
        map.forEach((k,v) -> {
            if(v > threshold) ans.add(k);
        });

        return ans;
    }
}