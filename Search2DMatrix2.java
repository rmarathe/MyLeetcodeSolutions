/**
* 240. Search a 2D Matrix -2
*/

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int i=0,j=0;
        while(j<=matrix[0].length-1 && matrix[0][j] <= target){
            j++;
        }
        int col=j-1;
        while(i<=matrix.length-1 && matrix[i][0] <= target){
            i++;
        }
        int row=i-1;
        //System.out.println(row);
        for(i=0;i<=row;i++){
            for(j=0;j<=col;j++){
                if(target == matrix[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
}
