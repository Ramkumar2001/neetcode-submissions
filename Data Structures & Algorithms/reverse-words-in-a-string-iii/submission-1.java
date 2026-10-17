class Solution {
    public String reverseWords(String s) {
        int i = 0, j = 0;
        char[] arr = s.toCharArray();
        while(j < arr.length){
            if(arr[j] != ' '){
                j += 1;
                continue;
            }

            reverse(arr, i, j-1);
            i = j + 1;
            j += 1;
        }

        reverse(arr, i, j-1);

        return new String(arr);
    }

    private void reverse(char[] s, int i, int j){
        while(i < j){
            char c = s[i];
            s[i] = s[j];
            s[j] = c;
            i += 1;
            j -= 1;
        }
    }
}
