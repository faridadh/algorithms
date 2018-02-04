package findShape;

import org.junit.Test;

import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;


public class SolutionTest {
    private Solution object = new Solution();
    @Test
    public void testFindShapes(){
        final boolean[][] matrix = {
                new boolean[] {false, false, true},
                new boolean[] {true, false, true},
                new boolean[] {true, true, true}

        };

        Collection<List<Solution.Coordinate>> result = object.findShapes(matrix);

        assertNotEquals(result, null);

    }
}
