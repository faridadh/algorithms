package flags;

//you can also use imports, for example:
//import java.math.*;
import java.util.*;
class Solution {
 public int solution(int[] A) {
     List<Integer> peaks = new ArrayList<Integer>();
     for(int i=1;i<A.length-1;i++){
         if( A[i-1]<A[i] && A[i]>A[i+1]){
             peaks.add(i);
         }
     }
		
		
		int solution= peaks.size();
		while( solution>0){
			int remainingFlags = solution;
			Integer lastFlag = null;
			for(Integer peak: peaks){
				if( lastFlag==null || peak-lastFlag>=solution){
					lastFlag = peak;
					remainingFlags--;
					if(remainingFlags==0){
						break;
					}
				}
			}		

			if( remainingFlags==0){
				break;
         } else {
             solution--;
         }
		}
     
     return solution;
 }
}
