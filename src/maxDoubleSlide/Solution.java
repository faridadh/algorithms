package maxDoubleSlide;

class Solution {
    public int solution(int[] A) {
        int current = A[1];
        int min = A[1];
        int max = 0;
        for(int i=3;i<A.length;i++){
            if(0> current+A[i-1]-Math.min(min, A[i-1])){
                min = A[i-1];
                current = A[i-1];
            } else {
                min = Math.min(min, A[i-1]);
                current = current + A[i-1];
            }

            max =Math.max( max, current-min);
        }

        return max;
    }
}