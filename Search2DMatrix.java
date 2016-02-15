/**
* 74. Search a 2D matrix
*/

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length ==0){
            return false;
        }
        int j=0;
        for(int i=0;i<matrix.length;i++){
                if(matrix[i][0]<=target && target<=matrix[i][matrix[0].length-1]){
                    //sequentially search
                    j=0;
                    while(j<matrix[0].length && matrix[i][j]<target){
                        j++;
                    }
                    if(matrix[i][j] == target){
                        return true;
                    }else{
                        break;
                    }
                }
        }
        return false;
    }
}
