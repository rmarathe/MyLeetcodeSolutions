/**
* 118. Pascal's Triangle
*/

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<Integer> inner = new ArrayList<Integer>(); //row
        List<List<Integer>> result = new ArrayList<List<Integer>>(); //holds final result
        if(numRows>=1){
            inner.add(1);
            result.add(inner);
        }
        if(numRows>=2){
            inner = new ArrayList<Integer>();
            inner.add(1);
            inner.add(1);
            result.add(inner);
        }
        List<Integer> temp ;
        for(int i=2;i<numRows;i++){
            temp = new ArrayList<Integer>();
            temp.add(inner.get(0));
            for(int k=0;k<inner.size()-1;k++){
                int sum = inner.get(k)+inner.get(k+1);
                temp.add(sum);
            }
            temp.add(inner.get(inner.size()-1));
            inner = new ArrayList<Integer>(temp);
            result.add(inner);
        }
        return result;
        
    }
}
