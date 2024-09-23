
/**
 * problem link: https://leetcode.com/problems/valid-parentheses
 * time: O(n * 1) = O(n)
 * Stack solution
 */


 import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            
            if (current == '(' || current == '{' || current == '[') {
                stk.push(current);

                // ['('] , ['{'] , ['[']

                System.out.println(stk);
            }


            else if (current == ')' || current == '}' || current == ']') {
               
                if (stk.isEmpty()) {
                    return false;
                } 

                 char popped = stk.pop();
                
              
                if ((current == ')' && popped != '(') ||
                    (current == '}' && popped != '{') ||
                    (current == ']' && popped != '[')) {
                    return false;
            }     
           
        }        
    
    }
     return stk.isEmpty();
  }
}