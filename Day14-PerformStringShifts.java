/* You are given a string s containing lowercase English letters, and a matrix shift, where shift[i] = [direction, amount]:

direction can be 0 (for left shift) or 1 (for right shift). 
amount is the amount by which string s is to be shifted.
A left shift by 1 means remove the first character of s and append it to the end.
Similarly, a right shift by 1 means remove the last character of s and add it to the beginning.
Return the final string after all operations.

 

Example 1:

Input: s = "abc", shift = [[0,1],[1,2]]
Output: "cab"
Explanation: 
[0,1] means shift to left by 1. "abc" -> "bca"
[1,2] means shift to right by 2. "bca" -> "cab"
Example 2:

Input: s = "abcdefg", shift = [[1,1],[1,1],[0,2],[1,3]]
Output: "efgabcd"
Explanation:  
[1,1] means shift to right by 1. "abcdefg" -> "gabcdef"
[1,1] means shift to right by 1. "gabcdef" -> "fgabcde"
[0,2] means shift to left by 2. "fgabcde" -> "abcdefg"
[1,3] means shift to right by 3. "abcdefg" -> "efgabcd"
 

Constraints:

1 <= s.length <= 100
s only contains lower case English letters.
1 <= shift.length <= 100
shift[i].length == 2
0 <= shift[i][0] <= 1
0 <= shift[i][1] <= 100 */

class Solution {
    public String stringShift(String s, int[][] shift) {
        String updatedString = "";
        int noOfShifts = shift.length;
        int effectiveShifts=0, effectiveDirection = 0, left = 0, right = 0;
        for(int i=0; i<noOfShifts; i++){
            int direction = shift[i][0];
            if(direction == 0){
                
                effectiveShifts = effectiveShifts - shift[i][1];
            } else {
                effectiveShifts += shift[i][1];
            }
            
        }
        
        effectiveShifts = effectiveShifts % s.length();
        if(effectiveShifts == 0){
            updatedString = s;
        } else if(effectiveShifts > 0){ 
            
            String firstPart = s.substring(s.length() - effectiveShifts, s.length());
            String secondPart = s.substring(0, s.length() - effectiveShifts);
            updatedString = firstPart + secondPart;
        } else {
            effectiveShifts = Math.abs(effectiveShifts);
            String firstPart = s.substring(effectiveShifts, s.length());
            String secondPart = s.substring(0,effectiveShifts);
            updatedString = firstPart + secondPart;
        }
            

        return updatedString;
    }
}
