class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder mod = new StringBuilder();
        int i = 0, j = 0;
        while(j < spaces.length){
            while(i < spaces[j]){
                mod.append(s.charAt(i));
                i += 1;
            }
            mod.append(" ");
            j += 1;
        }

        while(i < s.length()){
            mod.append(s.charAt(i));
            i += 1;
        }

        return mod.toString();
    }
}
