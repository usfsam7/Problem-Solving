/*
 * Top K Elements in List
    
      Given an integer array nums and an integer k, return the k most frequent elements within the array.

      The test cases are generated such that the answer is always unique.

      You may return the output in any order.

      Example 1:

      Input: nums = [1,2,2,3,3,3], k = 2

      Output: [2,3]
      Example 2:

      Input: nums = [7,7], k = 1

      Output: [7]


      - here is my solution -->
 */







import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;


public class topKFrequent {
           
      public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2,2, 2, 2, 2, 3};
        int k = 2;
        int[] result = topKFrequentChars(nums, k);

        System.out.println(Arrays.toString(result));
     }

     
    public static int[] topKFrequentChars(int[] nums, int k) {
     
        Hashtable<Integer, Long> countsTable = new Hashtable<>();   

        for (int i = 0; i < nums.length; i++) {
                 
             int target = nums[i];
             long count = Arrays.stream(nums).filter(num -> num == target).count();
             countsTable.put(target, count);

         }
        
    
        List<Map.Entry<Integer, Long>> entries = new ArrayList<>(countsTable.entrySet());

        Collections.sort(entries, new Comparator<Map.Entry<Integer, Long>>() {
            @Override
            public int compare(Map.Entry<Integer, Long> entry1, Map.Entry<Integer, Long> entry2) {
                return entry2.getValue().compareTo(entry1.getValue());
            }
        });

        List<Integer> topKeys = new ArrayList<>();

        for (int i = 0; i < k && i < entries.size(); i++) {
            topKeys.add(entries.get(i).getKey());
        }

        int[] topKs = new int[topKeys.size()];

        for (int i = 0; i < topKeys.size(); i++) {
            topKs[i] = topKeys.get(i);
        }

      return topKs;

    }
  }