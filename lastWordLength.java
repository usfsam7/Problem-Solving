/*
 * Given a string (s) consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

 

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
 
 */







public class lastWordLength {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        int lastWordLength = lengthOfLastWord(s);
        System.out.println(lastWordLength);
    }



    
        public static int lengthOfLastWord(String s) {
            int lastWordLength = 0;
    
            String[] words = s.split(" ");
    
              for (int x = 0; x < words.length; x++) {
                      
                       while (x == words.length -1) {
                         lastWordLength = words[x].length();
                         break;
                       }
              }
    
            return lastWordLength;
        }
    
}
