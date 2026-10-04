class Solution {
    public int appendCharacters(String s, String t) {
        //coaching
        //codinga
        int i = 0, j = 0;
        while(i < s.length() || j < t.length()){
            if(i == s.length()) break;
            if(j == t.length()) return 0;

            if(s.charAt(i) == t.charAt(j)){
                i += 1;
                j += 1;
            }
            else{
                i += 1;
            }
        }

        return t.length() - j;
    }
}