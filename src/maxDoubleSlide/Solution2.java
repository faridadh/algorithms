package maxDoubleSlide;

public class Solution2 {
    public int solution(int[] A) {
        final int N = A.length;
        int[] left = new int[N];
        int[] right = new int[N];

        for(int i=1; i<N-1; i++){
            left[i] = Math.max(left[i-1]+A[i],0);
        }

        for(int i=N-2; i>0; i--){
            right[i]= Math.max(right[i+1]+A[i], 0);
        }

        int max=0;
        for(int i=1;i<N-1;i++){
//            max = Math.max(max, [i-1]+A[i+1]);
        }

        return max;
    }
}
