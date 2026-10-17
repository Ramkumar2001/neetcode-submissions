class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i = 0, j = 0;
        while(i < word.length() && j < abbr.length()){
            if(Character.isDigit(abbr.charAt(j))){
                if(abbr.charAt(j) == '0') return false;
                StringBuilder num = new StringBuilder();
                while(j < abbr.length() && Character.isDigit(abbr.charAt(j))){
                    num.append(abbr.charAt(j));
                    j += 1;
                }
                i += Integer.valueOf(num.toString());
            }
            else if(word.charAt(i) != abbr.charAt(j)){
                return false;
            }

            while(i < word.length() && j < abbr.length() && (word.charAt(i) == abbr.charAt(j))){
                i += 1; j += 1;
            }
        }

        return i == word.length() && j == abbr.length();
    }
}