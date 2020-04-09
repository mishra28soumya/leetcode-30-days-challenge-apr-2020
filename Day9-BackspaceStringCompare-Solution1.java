/* Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.

Example 1:

Input: S = "ab#c", T = "ad#c"
Output: true
Explanation: Both S and T become "ac".
Example 2:

Input: S = "ab##", T = "c#d#"
Output: true
Explanation: Both S and T become "".
Example 3:

Input: S = "a##c", T = "#a#c"
Output: true
Explanation: Both S and T become "c".
Example 4:

Input: S = "a#c", T = "b"
Output: false
Explanation: S becomes "c" while T becomes "b".
Note:

1 <= S.length <= 200
1 <= T.length <= 200
S and T only contain lowercase letters and '#' characters */

class Solution {
    public boolean backspaceCompare(String S, String T) {
        
        String s1 = formatString(S);
        String t1 = formatString(T);
        if(s1.equals(t1)){
            return true;
        }
        return false;
        
        
    }
    
    public String formatString(String s){
        int len = s.length();
        char s1[] = new char[len];
        String s2 = "";
        int pointer = 0;
        for(int i=0; i<len; i++){
            char c = s.charAt(i);
            if(c != '#'){
                s1[pointer] = c;
                pointer++;
            } else {
                // s1[pointer-1] = '';
                if(pointer != 0){
                    pointer--;
                } 
            }
        }
        for(int i=0; i<pointer; i++){
            s2 = s2+s1[i];
        }
        return s2;
    }
}

