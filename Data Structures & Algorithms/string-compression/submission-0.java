class Solution {
  public int compress(char[] chars) {
    int i = 0, j = 0, k = 0;
    // A
    while (j < chars.length) {
      if (chars[j] != chars[i]) {
        chars[k++] = chars[i];
        int gap = j - i;
        if (gap > 1) {
          for(char c : String.valueOf(gap).toCharArray()) {
            chars[k++] = c;
          }
        }
        i = j;
      }
      j += 1;
    }

    chars[k++] = chars[i];
    if (j - i > 1) {
      for(char c : String.valueOf(j - i).toCharArray()) {
        chars[k++] = c;
      }
    }
    return k;
  }
}