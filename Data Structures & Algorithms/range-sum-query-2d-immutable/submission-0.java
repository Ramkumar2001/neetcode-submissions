class NumMatrix {

    private int[][] sumMatrix;

    public NumMatrix(int[][] matrix) {
        sumMatrix = new int[matrix.length][matrix[0].length];

        for(int i = 0; i < matrix.length; i += 1){
            for(int j = 0; j < matrix[0].length; j += 1){
                int topSum = i-1 >= 0? sumMatrix[i-1][j] : 0;
                int leftSum = j-1 >= 0 ? sumMatrix[i][j-1] : 0;
                int topLeftSum = (i-1 >= 0 && j-1 >= 0) ? sumMatrix[i-1][j-1] : 0;

                sumMatrix[i][j] = matrix[i][j] + topSum + leftSum - topLeftSum;
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int totalSum = sumMatrix[row2][col2];
        int topSum = (row1-1) >= 0 ? sumMatrix[row1-1][col2] : 0;
        int leftSum = (col1-1) >= 0 ? sumMatrix[row2][col1-1] : 0;
        int topLeftSum = (row1-1 >= 0 && col1-1>=0) ? sumMatrix[row1-1][col1-1] : 0;

        return totalSum - topSum - leftSum + topLeftSum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */