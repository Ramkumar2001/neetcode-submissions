class Solution {
    public int numRescueBoats(int[] nums, int limit) {
        //1 2 4 5, limit = 6
        //1 2 2 3 3 limit = 3
        //3 4 4 5 limit = 5
        Arrays.sort(nums);
        int total = 0;
        int i = 0, j = nums.length - 1;
        while(i <= j){
            if(i!=j && nums[j] + nums[i] <= limit){
                total += 1;
                i += 1;
                j -= 1;
            }
            else if(nums[j] > nums[i]){
                j -= 1;
                total += 1;
            }
            else{
                i += 1;
                total += 1;
            }
        }


        return total;
    }
}