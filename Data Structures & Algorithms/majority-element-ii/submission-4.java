class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);

            var copy = new HashMap<>(map);
            if(map.size() > 2){
                map.forEach((k, v) -> {
                    copy.put(k, copy.get(k) - 1);
                    if(copy.get(k) == 0) copy.remove(k);
                });
            }

            map = copy;
        }

        List<Integer> res = new ArrayList<>();
        for (int key : map.keySet()) {
            int frequency = 0;
            for (int num : nums) {
                if (num == key) frequency++;
            }
            if (frequency > nums.length / 3) {
                res.add(key);
            }
        }
        

        return res;

    }
}