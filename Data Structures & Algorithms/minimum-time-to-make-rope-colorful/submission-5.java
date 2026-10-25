class Solution {
  public int minCost(String colors, int[] neededTime) {
    int answer = 0, maximum = neededTime[0];
    for (int i = 1; i < colors.length(); i++) {
      if (colors.charAt(i) != colors.charAt(i - 1))
        maximum = 0;
      answer += Math.min(maximum, neededTime[i]);
      maximum = Math.max(maximum, neededTime[i]);
    }
    return answer;
  }
}
