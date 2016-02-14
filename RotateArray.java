/**
* 189. Rotate Array
*/

public class Solution {
    public void rotate(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k<=0){
            return;
        }
        if(k>nums.length){
            k=k%nums.length;
        }
        //copy n-k elements to temp array
        int[] temp = Arrays.copyOf(nums,nums.length-k);
        
        //move last k elements to the right
        System.arraycopy(nums,nums.length-k,nums,0,k);
        
        //copy n-k elements back to the original array
        System.arraycopy(temp,0,nums,k,nums.length-k);
    }
}
