class Solution {
    public int longestConsecutive(int[] nums) {
        //2 3 4 5 10 20
        int maxLen = 0;
        Set<Integer> set = new HashSet<>();

        for(int n: nums){
            set.add(n);
        }

        for(int num : set){
            if(!set.contains(num-1)){
                int currNum = num;
                int len = 1;

                while(set.contains(currNum + 1)){
                    currNum += 1;
                    len += 1;
                }

                maxLen = Math.max(maxLen, len);
            }
        }

        return maxLen;

    }
}
