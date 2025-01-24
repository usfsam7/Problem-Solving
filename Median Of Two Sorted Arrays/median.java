

// problem link: https://leetcode.com/problems/median-of-two-sorted-arrays/description




import java.util.Arrays;
// brute force  time: o(m + n)
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArr = new int [nums1.length + nums2.length];
        double median = 0;

        System.arraycopy(nums1, 0, mergedArr, 0, nums1.length);
        System.arraycopy(nums2, 0, mergedArr, nums1.length, nums2.length);

        Arrays.sort(mergedArr);  
        System.out.println(Arrays.toString(mergedArr));

        // [1, 2, 3, 4]
         // even length
        if (mergedArr.length % 2 == 0) {
          int mid1 = mergedArr[(mergedArr.length / 2) - 1];
          int mid2 = mergedArr[mergedArr.length / 2];
           System.out.println(mid1);
           System.out.println(mid2);
        
          median = (mid1 + mid2) / 2.0;
        } else {
          median = mergedArr[(mergedArr.length / 2)];
          System.out.println(median);

        }
        
        return median; 
    }
}

