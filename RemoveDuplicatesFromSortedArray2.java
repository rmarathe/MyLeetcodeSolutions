/**
* 80. Remove Duplicates from Sorted Array 2
*/


import java.util.*;

public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length ==0){
            return 0;
        }
        int count=0;
        for(int i=0;i<nums.length-2;i++){
           if(nums[i] == nums[i+1] && nums[i+1] == nums[i+2]){
               nums[i]='x';
           }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!='x'){
                nums[count++]=nums[i];
            }   
        }
        //System.out.println(Arrays.toString(nums));
        return count;
    }
}
