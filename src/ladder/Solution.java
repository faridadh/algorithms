package ladder;

class Solution {
    public int[] solution(int[] A, int[] B) {
        final int L = A.length;
        int[] fib = calcFib(L);
        int[] result = new int[L];
        for(int i=0; i<L; i++){
            result[i] = fib[A[i]]%(1<<B[i]);
        }
        return result;
    }

    private int[] calcFib(int L){
        int[] fib = new int[L+1];
        fib[0] = 1;
        fib[1]=1;
        for(int i=2;i<=L;i++){
            fib[i] = (fib[i-1]+ fib[i-2])%(1<<30);
        }

        return fib;
    }
}