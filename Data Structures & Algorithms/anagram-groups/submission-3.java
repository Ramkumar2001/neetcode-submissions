class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> sol = new ArrayList<>();

        for(String word: strs){
            int[] freq = new int[26];
            for(char c: word.toCharArray()){
                freq[c - 'a'] += 1; 
            }
            map.computeIfAbsent(Arrays.toString(freq), k -> new ArrayList()).add(word);
        }

        map.forEach((k, v) -> {
            sol.add(v);
        });

        return sol;
    }
}
