/**
* 119. Pascal's Triangle II
*/

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> result = new ArrayList<Integer>();
        List<Integer> temp;
        if(rowIndex==0){
            result.add(1);
            return result;
        }
        if(rowIndex ==1)
        {
            result.add(1);
            result.add(1);
            return result;
        }
        if(rowIndex >=2){
            result.add(1);
            result.add(1);
            for(int k=2;k<rowIndex+1;k++){
                temp = new ArrayList<Integer>();
                temp.add(1);
                for(int i=0;i<result.size()-1;i++){
                    int sum = result.get(i)+result.get(i+1);
                    temp.add(sum);
                }
                temp.add(1);
                result = new ArrayList<Integer>(temp);
            }
        }
        
        return result;
    }
}
