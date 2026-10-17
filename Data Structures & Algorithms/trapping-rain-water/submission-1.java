class Solution {
    public int trap(int[] height) {
        //0,2,0,3,1,0,1,3,2,1
        int maxLeft = 0, maxRight = height[height.length - 1];
        int l = 0, r = height.length - 1;
        int ans = 0;
        while(l <= r){
            if(maxLeft < maxRight){
                ans += Math.max(maxLeft - height[l], 0);
                maxLeft = Math.max(maxLeft, height[l]);
                l += 1;
            }
            else{
                ans += Math.max(maxRight - height[r], 0);
                maxRight = Math.max(maxRight, height[r]);
                r -= 1;
            }
        }

        return ans;
    }
}
