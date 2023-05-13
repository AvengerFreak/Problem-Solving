package Arrays;
class RotateImage {
  
  // solution to leetcode problem https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/770/
    public void rotate(int[][] matrix) {
        
        // [[1,2,3],[4,5,6],[7,8,9]]
        // [[7,4,1],[8,5,2],[9,6,3]]
        
        // arr[n-1][0] arr[1][0] arr[0][0]
        // arr[n-1][1] arr[1][1] arr[0][1]
        // arr[n-1][n-1]arr[n-1][1] arr[0][n-1]
            
        int row = matrix.length;
	//first find the transpose of the matrix.
        for (int i = 0; i < row; i++){
            for (int j = i; j < row; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
	//reverse each row
        for (int i = 0; i< row; i++){
            for(int j = 0; j< row/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][row - 1 - j];
                matrix[i][row - 1 - j] = temp;
            }
        }
        
    }
}
