/**
* 26. Remove Duplicates from Sorted Array
*/

public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length ==0){
            return 0;
        }
        int count = 0; //maintains length of new array
        for(int i=0;i< nums.length-1;i++){
            if(nums[i] != nums[i+1]){
                //replace duplicate elements
                nums[count++]=nums[i];
            }
        }
        nums[count++]=nums[nums.length-1];
        return count;
    }
}
