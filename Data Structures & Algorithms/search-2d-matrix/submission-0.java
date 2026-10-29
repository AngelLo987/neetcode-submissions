class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int right = (matrix[0].length * matrix.length)-1; 
        int left = 0; 

        while (left <= right){
            int middle = left + ((right-left)/2);
            int m = middle/(matrix[0].length);
            int n = middle%(matrix[0].length);
            if (matrix[m][n] == target){
                return true;
            }
            else{ 
                if (matrix[m][n] < target){
                    left = middle+1; 
                }
                else{
                    right = middle-1; 
                }
            }
        }
        return false; 
    }
}
