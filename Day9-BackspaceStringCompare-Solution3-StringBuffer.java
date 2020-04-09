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
S and T only contain lowercase letters and '#' characters. */



class Solution {
    public boolean backspaceCompare(String S, String T) {
        
        String s1 = removeBackspace(S);
        String t1= removeBackspace(T);
        if(s1.equals(t1)){
            return true;
        }
        return false;
    
    }
     public String removeBackspace(String s){
         
        StringBuffer sb = new StringBuffer();
         for(int i=0; i<s.length(); i++){
             if(s.charAt(i)!='#'){
                 sb.append(s.charAt(i));
             } else if (sb.length() > 0){
                 sb.deleteCharAt(sb.length()-1);
             }
         }
         return sb.toString();
     }
}
