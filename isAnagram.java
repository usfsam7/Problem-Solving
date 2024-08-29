
/*
 *        Valid Anagram
 
          Given two strings s and t, return true if t is an anagram of s, and false otherwise.

          An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

          Example 1:

          Input: s = "anagram", t = "nagaram"
          Output: true
          Example 2:

          Input: s = "rat", t = "car"
          Output: false
 */




/**
          * solution
*/

 import java.util.Arrays;

   public class isAnagram {
         
          public static void main(String[] args) {
            String s = "anagram";
            String t = "nagaram";
    
            boolean result = isAnagramOrNot(s, t);
    
            System.out.println(result);
          }
    
    
    
      
            public static boolean isAnagramOrNot(String s, String t) {
                String[] sChars = s.split("");
                String[] tChars = t.split("");
             
        
        
                             Arrays.sort(sChars);
                             Arrays.sort(tChars);
        
        
                if (Arrays.equals(sChars, tChars)) {
                  return true;
                }
                   
        
        
                return false;
            }
         }
     
    
