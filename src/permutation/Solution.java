package permutation;

class Solution {
    public int solution(int[] A) {
        final int N = A.length;

        for(int i=0; i<N;i++){
            while(A[i]!=i+1){
                if(A[i]>N){
                    return 0;
                }

                int j = A[i]-1;
                if(A[j]==j+1){
                    return 0;
                }

                A[i] = A[j];
                A[j] = j+1;
            }
        }

        return 1;
    }
}