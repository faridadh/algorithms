package nu2011;

//you can also use imports, for example:
//import java.math.*;
import java.util.*;
class Solution {
	public int solution(int[] A, int[] B, int[] P, int[] Q, int[] R, int[] S){
		int k = P.length;
		List<Integer> medians = new ArrayList<Integer>();
		for( int i=0; i< k;i++){
			int median = calcMedian( A, B, P[i], Q[i], R[i], S[i]);
			medians.add(median);	
		}

		Collections.sort(medians);
		return medians.get(k/2);

	}

	int calcMedian(int[] A, int[] B, int p , int q, int r, int s){
		int median;
		int x = q-p+1;
		int y = s-r+1;
		int z = Math.abs(x-y)/2;
		if( x>y ){
		 	if(A[p+z]>=B[s]){
				median = A[p+z];
			} else if(A[q-z]<=B[r]){
				median = A[q-z];
			} else {
				median = calcMedEqual(A, B, p+z, q-z, r, s);
			}
	
		} else { // x<=y
			if(B[r+z]>=A[q]){
				median = B[r+z];
			} else if(B[s-z]<=A[p]){
				median = B[s-z];
			} else {
				median = calcMedEqual(A, B, p, q, r+z, s-z);
			}
		}
		
		return median;
	}

	int calcMedEqual(int[] A, int[] B, int p, int q, int r, int s ){
		int median;
		int x = q-p+1;
		int y = s-r+1;
		if( x+y<=5 ){
		    int[] all = new int[x+y];
		    System.arraycopy(A, p, all, 0, x);
		    System.arraycopy(B, r, all, x, y);
		    Arrays.sort(all);
			median = all[(x+y)/2];
		} else {
			int d= (x+y)/4;
			if(A[p+d]<B[s-d]){
				median=calcMedEqual(A, B, p+d, q, r, s-d);
			} else {
				median=calcMedEqual(A, B, p, q-d, r+d, s);
			}
		}
		
		return median;
	}

	}

