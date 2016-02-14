/**
* 35. Search insert position in a sorted array
*/

public class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums == null || nums.length==0){
            return 0;
        }
        int i=0;
        while(i<=nums.length-1 && nums[i]<target){
            i++;
        }
       
        return i;
    }
}
