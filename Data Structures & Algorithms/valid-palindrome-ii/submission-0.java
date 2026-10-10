class Solution {
    public boolean validPalindrome(String s) {
        for(int i = 0; i < s.length(); i += 1){
            StringBuilder newStr = new StringBuilder(s);
            newStr.deleteCharAt(i);
            if(isPalindrome(newStr.toString())) return true;
        }
        return false;
    }

    private boolean isPalindrome(String s){
        int i = 0, j = s.length() - 1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i += 1;
            j -= 1;
        }

        return true;
    }
}