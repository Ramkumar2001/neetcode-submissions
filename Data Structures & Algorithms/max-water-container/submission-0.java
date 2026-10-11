class Solution {
    public int maxArea(int[] heights) {
        int maxArea = Integer.MIN_VALUE;
        int i = 0, j = heights.length - 1;

        while(i < j){
            int h = Math.min(heights[i], heights[j]);
            maxArea = Math.max(maxArea, h * (j-i));
            if(heights[i] < heights[j]){
                i += 1;
            }
            else{
                j -= 1;
            }
        }

        return maxArea;
    }
}
