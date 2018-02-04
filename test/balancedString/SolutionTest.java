package balancedString;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void testPositive(){
        assertEquals(1, solution.solution("[{()}]"));
    }

    @Test
    public void testPositive1(){
        assertEquals(1, solution.solution("{[()()]}"));
    }
    @Test
    public void testNegativeMissingLeft(){
        assertEquals(0, solution.solution("[[)]]"));
    }

    @Test
    public void testNegativeMissingRight(){
        assertEquals(0, solution.solution("[[("));
    }

    @Test
    public void testNegativeInbalance(){
        assertEquals(0, solution.solution(")("));
    }
}
