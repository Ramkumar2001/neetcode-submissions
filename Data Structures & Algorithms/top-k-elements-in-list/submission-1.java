class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        //O(n) SC
        int[] sol = new int[k];
        for(int n : nums){
            map.put(n, map.getOrDefault(n,0) + 1);
        }

        List<Integer>[] freq = new List[nums.length + 1];
        for(int i = 0; i < freq.length; i += 1){
            freq[i] = new ArrayList<>();
        }//O(n) worst case SC
        
        map.forEach((key, value) -> {
            freq[value].add(key);
        });

        int idx = 0;
        for(int i = freq.length - 1; i >=0 && idx < k ; i -= 1){

            for(int j = 0; j < freq[i].size(); j += 1){
                sol[idx] = freq[i].get(j);
                idx += 1;
                if(idx == k) return sol;
            }
            
        }
        //O(n) TC

        return sol;
        
    }
}
