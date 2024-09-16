/**
 * problem page : https://leetcode.com/problems/container-with-most-water/description/
 * Two Pointers solution
 */

 


 class Solution {
    public int maxAmount(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxAmount = 0;

        while (left < right) {
            int currentAmount = Math.min(height[left], height[right]) * (right - left);
            maxAmount = Math.max(maxAmount, currentAmount);

              if (height[left] < height[right]) {
                left++;
              } else {
                right--;
             }
           }
           return maxAmount;
        }
    }
