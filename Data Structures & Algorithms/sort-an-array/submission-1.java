class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(0, nums.length - 1, nums);
        return nums;
    }

    private void mergeSort(int left, int right, int[] nums){
        if(left == right) return;

        int mid = left + (right-left)/2;
        mergeSort(left, mid, nums);
        mergeSort(mid+1, right, nums);

        int[] leftArray = new int[mid-left+1];
        int[] rightArray = new int[right-mid];

        for(int i = left; i <= mid; i += 1){
            leftArray[i-left] = nums[i];
        }
        for(int i = mid+1; i <= right; i += 1){
            rightArray[i-mid-1] = nums[i];
        }

        int leftArrayPtr = 0, rightArrayPtr = 0;

        int i = left;
        while(leftArrayPtr < leftArray.length && rightArrayPtr < rightArray.length){
            if(leftArray[leftArrayPtr] < rightArray[rightArrayPtr]){
                nums[i] = leftArray[leftArrayPtr];
                leftArrayPtr += 1;
            }
            else{
                nums[i] = rightArray[rightArrayPtr];
                rightArrayPtr += 1;
            }
            i += 1;
        }

        while(leftArrayPtr < leftArray.length){
            nums[i] = leftArray[leftArrayPtr];
            leftArrayPtr += 1;
            i += 1;
        }
        while(rightArrayPtr < rightArray.length){
            nums[i] = rightArray[rightArrayPtr];
            rightArrayPtr += 1;
            i += 1;
        }
    }
}