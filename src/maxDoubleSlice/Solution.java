package maxDoubleSlice;

public class Solution {
    public int solution(int[] A) {
        int currentSliceTotal=0; 
        Integer currentMin=null, SliceTotalBeforeMin =0;
        int maxSliceTotal= Integer.MIN_VALUE;
        for(int i= 1; i<A.length-1; i++){
            if( currentMin==null || A[i] < currentMin ){
                if(currentMin!=null ){
                	if(SliceTotalBeforeMin+currentMin <0){
                		currentSliceTotal-=SliceTotalBeforeMin;
	                } else {
	                	currentSliceTotal += currentMin;
	                }
                }                
                currentMin = A[i];
                SliceTotalBeforeMin  =currentSliceTotal;
                
                if( SliceTotalBeforeMin<0){
                	SliceTotalBeforeMin = 0;
                	currentMin = null;
                	currentSliceTotal = 0;
                }
            } else {
                currentSliceTotal+= A[i];
            }
            
            
            maxSliceTotal = Math.max(maxSliceTotal, currentSliceTotal);
        }
        
        return maxSliceTotal;
    }
}
