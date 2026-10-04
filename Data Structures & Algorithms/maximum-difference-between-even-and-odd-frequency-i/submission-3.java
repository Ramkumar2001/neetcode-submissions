class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        for(char c : s.toCharArray()){
            freq[c - 'a'] += 1;
        }

        int maxOdd = 0;
        int minEven = Integer.MAX_VALUE;

        for(int n : freq){
            if(n == 0) continue;
            if(n%2 == 0){
                minEven = Math.min(minEven, n);
            } 
            else {
                maxOdd = Math.max(maxOdd, n);
            }
        }

        return maxOdd - minEven;
    }
}