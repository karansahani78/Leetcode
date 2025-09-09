import java.util.*;

class Solution {
    public String reverseWords(String s) {
          // trailing space removed 
          s = s.trim(); // single spaces extra trailing spaces removed remain single
         //s = "the sky is blue"
        String [] sArr = s.split("\\s+"); //  the '.' sky '.' is '.'blue
        StringBuilder word = new StringBuilder();
        boolean seen = true;  
        for(int i=sArr.length-1; i>=0; i--){
            if(sArr[i].isEmpty()) continue;  // empty skipeed 
            if(!seen) word.append(" "); // inserted one space  // agar '.' nahi mila hai toh add kardo or if already added hai toh kuch mat karo  /// blue '.' is '.'
            word.append(sArr[i]);
            seen = false;
        }
        return word.toString();
        
    }
}