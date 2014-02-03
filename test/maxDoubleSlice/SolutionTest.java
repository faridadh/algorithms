package maxDoubleSlice;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testSolution() {
		int[] A = new int[] {1,-2,3,4,5,6,7,8,9,10};
		
		int result = new Solution().solution(A);
		
		assertEquals(42, result);
	}

	@Test
	public void testWithNegative() {
		int[] A = new int[] {1,-2,3,4,5,6,7,8,9,10};
		
		int result = new Solution().solution(A);
		
		assertEquals(42, result);
	}

	@Test
	public void testWithTwoNegatives() {
		int[] A = new int[] {1,-2,-3,4,5,6,7,8,9,10};
		
		int result = new Solution().solution(A);
		
		assertEquals(39, result);
	}

	@Test
	public void testWithThreeNegatives() {
		int[] A = new int[] {1,-2,3,-4,5,6,-1,8};
		
		int result = new Solution().solution(A);
		
		assertEquals(14, result);
	}

	@Test
	public void testRandoms() {
		int[] A = new int[] {10,8,-2,3,-4,3,5,-6,1,7};
		
		int result = new Solution().solution(A);
		
		assertEquals(14, result);
	}
}
