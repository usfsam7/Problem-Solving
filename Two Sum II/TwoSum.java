import java.util.Arrays;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * 
 * Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

 * Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]

 * Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


 * Here is my solution : 
 */


  public class TwoSum {
      
       public static void main(String[] args) {
          int[] nums = {3, 3};
          int target = 6;
          int[] result = twoSum(nums, target);

          System.out.println(Arrays.toString(result));
       }
 


      public static int[] twoSum(int[] nums, int target) {


         int firstOp = 0;
         int lastOp = 0;

      for (int i = 0; i < nums.length - 1; i++) { 
           for (int j = i + 1; j < nums.length; j++) { 
                    
             int expectedTarget = nums[i] + nums[j];

             if (expectedTarget == target) {
                 firstOp = i;
                 lastOp = j;
             }
          }
       }
    return new int[] {firstOp, lastOp};

      }
    
}