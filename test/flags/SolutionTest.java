package flags;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testSolution() {
		int result = new Solution().solution( 
				new int[] {1 
			    , 5 
			    , 3 
			    , 4 
			    , 3 
			    , 4 
			    , 1 
			    , 2 
			    , 3 
			    , 4 
			    , 6 
			    , 2});
		
		assertEquals(3, result);
	}

}
