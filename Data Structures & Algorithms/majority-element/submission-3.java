class Solution {
    public int majorityElement(int[] nums) {
        int c = nums[0];
        int v = 1;

        for(int i = 1; i < nums.length; i += 1){
            if(c == nums[i]){
                v += 1;
            }
            else{
                v -= 1;
            }

            if(v == 0){
                c = nums[i];
                v = 1;
            }
        }

        return c;
    }
}