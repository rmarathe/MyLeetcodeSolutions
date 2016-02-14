/**
* 81. Search in rotataed sorted aray (duplicated allowed)
*/

public class Solution {
    public boolean search(int[] nums, int target) {
        if(nums == null || nums.length ==0){
            return false;
        }
        
        int low=0;
        int high = nums.length-1;
        int mid=0;
        
        while(low<=high){
            mid=low+(high-low)/2;
            if(target == nums[mid]){
                return true;
            }
            if(nums[low]<nums[mid]){
                if(target<nums[mid] && target>=nums[low]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else if(nums[low]>nums[mid]){
                if(target<=nums[high] && target>nums[mid]){
                    low=mid+1;
                }else{
                    high = mid-1;
                }
            }else{
                //handle the extracase for duplicates
                //increment the lower bound
                low++;
            }
        }
        return false;
    }
}
