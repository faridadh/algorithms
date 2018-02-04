package tapeEquilibrium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void testSimple(){
        final int[] A = {3, 1, 2, 4, 3};
        assertEquals(1, solution.solution(A));
    }

    @Test
    public void testDouble(){
        final int[] A = {-1000, 1000};
        assertEquals(2000, solution.solution(A));
    }
}
