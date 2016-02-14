/**
* Plus One
*/

public class Solution {
    
    public int[] plusOne(int[] digits) {
        
        if(digits == null || digits.length == 0){
            return null;
        }
        
        int carry=1;
        for(int i=digits.length-1;i>=0;i--){
            digits[i]+=carry;
            if(digits[i]>=10)
            {
                carry=digits[i]/10;
                digits[i] = digits[i]%10;
                
            }else{
                carry=0;
                break;
            }
        }
        if(carry!=0){
            int[] result = new int[digits.length+1];
            result[0] = carry;
            for(int i=0;i<digits.length;i++){
                result[i+1] = digits[i];
            }
            return result;
        }
        return digits;
        
    }
}
