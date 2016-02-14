/**
* 219. Contains Duplicate II
* Given an array of integers and an integer k, find out 
* whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k.
*/

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums==null || nums.length==0){
            return false;
        }
        //<k,v> = < nums[x], index >
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int index = map.get(nums[i]);
                if(Math.abs(i-index) <= k){
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }
}
