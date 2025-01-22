
/*
 * problem link : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
 */


 // solution

 import java.lang.Math;

class Solution {
    public int findMin(int[] nums) {

      int left = 0;
      int right = nums.length - 1;
      
      // rotated 0 times
      int min = nums[0];

      while (left <= right) {
        if (nums[left] < nums[right]) {
            min = Math.min(min, nums[left]);
        } else {
            min = Math.min(min, nums[right]);
        }

       

         int mid = (left + right) / 2;
           min = Math.min(min, nums[mid]);

             if (nums[mid] >= nums[left]) {
                 left++;
             } else {
              right--;
           }
    
      }

       return min;
    }
}