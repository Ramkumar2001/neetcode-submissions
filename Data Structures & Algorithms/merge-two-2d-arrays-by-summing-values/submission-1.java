class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<List<Integer>> sol = new ArrayList<>();
        int i = 0, j = 0;
        while(i < nums1.length && j < nums2.length){
            int[] first = nums1[i];
            int[] second = nums2[j];

            if(first[0] == second[0]){
                sol.add(List.of(first[0], first[1] + second[1]));
                i += 1;
                j += 1;
            }
            else if(first[0] < second[0]){
                sol.add(List.of(first[0], first[1]));
                i += 1;
            }
            else{
                sol.add(List.of(second[0], second[1]));
                j += 1;
            }
        }

        while(i < nums1.length){
            sol.add(List.of(nums1[i][0], nums1[i][1]));
            i += 1;
        }

        while(j < nums2.length){
            sol.add(List.of(nums2[j][0], nums2[j][1]));
            j += 1;
        }

        int[][] ans = new int[sol.size()][2];
        for(i = 0; i < ans.length; i += 1){
            ans[i][0] = sol.get(i).get(0);
            ans[i][1] = sol.get(i).get(1);
        }

        return ans;
    }
}
