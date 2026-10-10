class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length()-1;
        s = s.toUpperCase();
        while(i < j){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i += 1;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(j))){
                j -= 1;
                continue;
            }

            if(s.charAt(i) != s.charAt(j)) return false;
            i += 1; j -= 1;
        }

        return true;
    }
}
