/**
* Mininum Size Subarray sum
*/

public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int min_len = Integer.MAX_VALUE;
        int i=0, sum=0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            while(sum>=s){
                min_len = Math.min(min_len, j-i+1);
                sum=sum-nums[i];
                i++;
            }
        }
        
        return min_len == Integer.MAX_VALUE? 0: min_len;
    }
}
