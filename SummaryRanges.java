/**
* 228. Summary Ranges
*/

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<String>();
        if(nums == null || nums.length ==0){
            return ranges;
        }
        
        String str;
        
        int start=0, end=0;
        
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1==nums[i+1]){
                continue;
            }
            //if not equal
            if(i == start){
                str = ""+nums[start];
                ranges.add(str);
            }else{
                str = nums[start]+"->"+nums[i];
                ranges.add(str);
            }
            start=i+1;
        }
        if(nums.length-1 == start){
                str = ""+nums[start];
        }else{
                str = nums[start]+"->"+nums[nums.length-1];
        }
        ranges.add(str);
        return ranges;
    }
}
