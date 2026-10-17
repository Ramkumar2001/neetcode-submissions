class Solution {
    public int trap(int[] height) {
        int ans = 0;
        int[] maxLeft = new int[height.length];
        maxLeft[0] = 0;
        for(int i = 1; i < maxLeft.length; i += 1){
            maxLeft[i] = Math.max(maxLeft[i-1], height[i-1]);
        }
        int maxRight = 0;

        for(int i = height.length-1; i >= 0; i -= 1){
            ans += Math.max(Math.min(maxLeft[i], maxRight) - height[i], 0);
            maxRight = Math.max(maxRight, height[i]);
        }

        return ans;
    }
}
