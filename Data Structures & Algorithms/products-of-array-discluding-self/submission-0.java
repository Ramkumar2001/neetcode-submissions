class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] sol = new int[nums.length];
        int[] leftProduct = new int[nums.length];
        Arrays.fill(leftProduct, 1);
        leftProduct[0] = 1;
        for(int i = 1; i < nums.length; i += 1){
            leftProduct[i] = leftProduct[i-1] * nums[i-1];
        }

        int rightProduct = 1;
        for(int i = nums.length - 1; i >= 0; i -=1){
            sol[i] = leftProduct[i] * rightProduct;
            rightProduct *= nums[i];
        }

        return sol;
    }
}  
