package permutation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void testPositive(){
        int[] A = new int[] {4,3,1,2};
        assertEquals(1, solution.solution(A));
    }

    @Test
    public void testNegative(){
        int[] A = new int[] {3,1,4};
        assertEquals(0, solution.solution(A));
    }
}
