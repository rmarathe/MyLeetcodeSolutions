/**
* 34. Search for Range
*/

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0]=result[1]=-1;
        if(nums == null || nums.length ==0){
            return result;
        }
        int low=0;
        int high=nums.length-1;
        int mid=0;
        
        while(low<=high){
            mid=low+(high-low)/2;
            if(target == nums[mid]){
                break;
            }
            if(target<nums[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        if(low<=high){
            //found value
            int i=mid;
            int j=mid;
            int count=0;
            while(i>=0 && nums[i] == target){
                i--;
            }
            while(j<nums.length && nums[j]==target){
                j++;
            }
            result[0]=i+1;
            result[1]=j-1;
            return result;
        }
        return result;
        
    }
}
