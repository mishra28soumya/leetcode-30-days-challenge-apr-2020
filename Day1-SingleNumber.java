/*
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4
*/

import java.util.*;
class Solution {
    public int singleNumber(int[] arr){
        
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0; i<arr.length; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],(hm.get(arr[i])+1));
            } else{
                hm.put(arr[i],1);
            }
        }
        for(int i=0; i<arr.length; i++){
             if(hm.get(arr[i])>1){
                continue;
            } else {
                return arr[i];
            }
        }       
        return 0;
        
    }
}
