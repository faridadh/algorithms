package tapeEquilibrium;

import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        int currentDiff = A[0];
        for(int i=1; i<A.length;i++){
            currentDiff -=A[i];
        }

        int minDiff = Math.abs(currentDiff);
        for(int i=1; i<A.length-1; i++){
            currentDiff +=2*A[i];
            minDiff = Math.min(minDiff, Math.abs(currentDiff));
        }

        return minDiff;
    }
}