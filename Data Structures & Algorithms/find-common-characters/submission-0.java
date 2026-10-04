class Solution {
    public List<String> commonChars(String[] words) {
        int[] common = new int[26];
        for(char c : words[0].toCharArray()){
            common[c - 'a'] += 1;
        }

        for(int i = 1; i < words.length; i += 1){
            String word = words[i];
            int[] intersect = new int[26];
            for(char c: word.toCharArray()){
                if(common[c - 'a'] == 0) continue;
                if(intersect[c - 'a'] < common[c - 'a']){
                    intersect[c - 'a'] += 1;
                }
            }
            common = intersect;
        }

        List<String> ans = new ArrayList<>();
        for(int i = 0; i < 26; i += 1){
            if(common[i] == 0) continue;
            for(int j = 0; j < common[i]; j += 1){
                ans.add(String.valueOf((char)('a' + i)));
            }
        }
        return ans;
    }
}