package dominator;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testSolution() {
		int A[] = {3,4,3,2,3,-1,3,3	};
		int result = new Solution().solution(A);
		assertEquals(3, result);
	}
}
