class Solution {
    public boolean isAnagram(String s, String t) {
        int freq[] = new int[26];

        if(s.length() != t.length()) return false;
        
        for(char c: s.toCharArray()){
            freq[c-'a'] += 1;
        }

        for(char c: t.toCharArray()){
            if(freq[c-'a'] <= 0) return false;
            freq[c-'a'] -= 1;
        }
        return true;
    }
}
