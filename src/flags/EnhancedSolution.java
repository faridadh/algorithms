package flags;

public class EnhancedSolution {
	public int solution(int[] A){
		if( A==null || A.length<3){
			return 0;
		}
		
		int[] next = new int[A.length];
		int nextPeak=-1;
		for(int i =1; i<A.length; i++){
			if(nextPeak<i){
				for(nextPeak=i; nextPeak<A.length-1; nextPeak++){
					if(A[nextPeak-1]<A[nextPeak] && A[nextPeak]>A[nextPeak+1]){
						break;
					}
				}
			}
			
			next[i] = nextPeak;
		}
		
        next[0] = next[1];
        
		int max = new Double(Math.sqrt(A.length)).intValue();
		
		boolean failed = true ;
		int f=max;
		while(f>0 && failed){
			int v=0;
			for(int p=0; p<A.length-1 && next[p]<A.length-1 && v<f; v++, p+=max){
				p = next[p];
			}
			
			if(v<f){
				f--;
			} else {
				failed = false;
			}
			
		}
		
		return f;
	}
}
