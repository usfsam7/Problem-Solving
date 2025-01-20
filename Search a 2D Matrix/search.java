/**
 * problem link : https://leetcode.com/problems/search-a-2d-matrix
 */


// binary search solution


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int row = 0;
        int col = cols - 1;

        while(row < rows && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
       
        return false;
    }
}

// brute force solution

class Solution2 {
    public boolean searchMatrix(int[][] matrix, int target) {
       for (int i = 0; i < matrix.length; i++) {
           for (int  j = 0; j < matrix[i].length; j++) {
               if (matrix[i][j] == target) {
                  return true;
               }
           }
       }
       

        return false;
    }
}