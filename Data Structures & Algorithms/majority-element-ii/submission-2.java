class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int can1 = -1, can2 = -1, cnt1 = 0, cnt2 = 0;

        for (int n : nums) {
            if (n == can1) {
                cnt1++;
            }
            else if (n == can2) {
                cnt2++;
            }
            else if (cnt1 == 0) {
                can1 = n;
                cnt1 = 1;
            }
            else if (cnt2 == 0) {
                can2 = n;
                cnt2 = 1;
            }
            else {
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = cnt2 = 0;
        for(int n : nums){
            if(can1 == n) cnt1 += 1;
            if(can2 == n) cnt2 += 1;
        }

        List<Integer> ans = new ArrayList<>();
        if(cnt1 > nums.length/3) ans.add(can1);
        if(cnt2 > nums.length/3 && can1 != can2) ans.add(can2);

        return ans;
    }
}