class Solution {
    public int[] replaceElements(int[] arr) {
        int[] sol = new int[arr.length];

        int greatestToRight = -1;
        for(int i = arr.length - 1; i>=0; i-=1){
            sol[i] = greatestToRight;
            greatestToRight = Math.max(greatestToRight, arr[i]);
        }

        return sol;
    }
}