package nu2011;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {
		int[] A = new int[] {-2, 4, 10, 13};
		int[] B = new int[] {5, 6, 8, 12, 13};
		int[] P = new int[] { 2, 1, 0};
		int[] Q = new int[] {3, 2, 3};
		int[] R = new int[] {0,0,1};
		int[] S = new int[] {4, 0, 3};

		int result = new Solution().solution(A, B, P, Q, R, S);
		assertEquals(8, result);
	}

	@Test
	public void test2() {
		int[] A = new int[] {-2, 4, 10, 13, 14};
		int[] B = new int[] {5, 6, 8, 12, 13, 16};
		int[] P = new int[] { 2, 1, 0, 0, 0, 0, 0};
		int[] Q = new int[] { 3, 2, 3, 3, 3, 4, 4};
		int[] R = new int[] { 0, 0, 1, 0, 0, 0, 2};
		int[] S = new int[] { 4, 0, 3, 4, 4, 5, 3};
		//                   10  5  8  8  8  10 10

		int result = new Solution().solution(A, B, P, Q, R, S);
		assertEquals(8, result);
	}

	@Test
	public void test3() {
		int[] A = new int[] {-2-200, 4-200, 10-200, 13-200, 14-200, 17-200};
		int[] B = new int[] {5-200, 6-200, 8-200, 12-200, 13-200, 16-200 , 19-200};
		int[] P = new int[] { 4, 1, 0, 0, 0, 0, 0};
		int[] Q = new int[] { 5, 2, 3, 3, 5, 4, 4};
		int[] R = new int[] { 4, 0, 4, 0, 0, 0, 2};
		int[] S = new int[] { 6, 0, 6, 4, 6, 5, 3};
		//                   16  5 13  8  12  10 10

		int result = new Solution().solution(A, B, P, Q, R, S);
		assertEquals(10-200, result);
	}
}
