package ladder;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void testSmall(){
        int[] result = solution.solution(
                new int[]{4, 4, 5, 5, 1},
                new int[]{3, 2, 4, 3, 1});

        assertArrayEquals(new int[]{5, 1, 8, 0, 1}, result);
    }

    @Test
    public void testLarger(){
        int L=100;
        int[] A = new int[100];
        Arrays.fill(A, 100);
        int[] B = new int[100];
        Arrays.fill(B, 4);
        int[] result = solution.solution(A, B);

        System.out.println(result);
    }
}
