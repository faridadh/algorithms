package dominator;

public class Solution {
	public int solution(int A[]){
		Integer cand=null;
		int repeat =0;
		for( int a: A){
			if( repeat>0 ){
				if(cand!=null && cand==a){
					repeat++;
				} else {
					repeat--;
				}
			} else {
				cand = a;
				repeat++;
			}
		}
		
		int candIndex = -1;
		if( cand!=null && repeat>0){
			repeat =0;
			for(int i=0;i<A.length;i++){
				if(cand==A[i]){
					repeat++;
					candIndex = i;
				}
			}
		}

		return ( repeat>(A.length/2)) ? candIndex : -1;
	}
}
