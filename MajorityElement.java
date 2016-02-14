/**
* 169. Majority Element
* 
* Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
* You may assume that the array is non-empty and the majority element always exist in the array.
*/

public class Solution {
    public int majorityElement(int[] nums) {
        if(nums==null || nums.length ==0){
            return 0;
        }
        Arrays.sort(nums);
        
        //since element appears more than n/2 times, it will always be the middle element in the sorted array
        return nums[nums.length/2]; 
    }
}
