class Solution {
    public int minCost(String colors, int[] neededTime) {
        int cost = 0;
        int sum = 0, maxi = neededTime[0];
        int i = 0, j = 0;
        while(j < colors.length()){
            if(colors.charAt(i) != colors.charAt(j)){
                cost += sum - maxi;
                sum = 0;
                maxi = neededTime[j];
                i = j;
            }

            sum += neededTime[j];
            maxi = Math.max(maxi, neededTime[j]);
            j += 1;
            
        }

        cost += sum - maxi;

        return cost;
    }
}
