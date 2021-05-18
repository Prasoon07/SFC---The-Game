package Model.structure;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author praso
 */
public class CellTest {
    
    public CellTest() {
    }
    
    @Before
    public void setUp() {
    }

   
    @Test
    public void testIsInCounting() {
        Cell c = new Cell();
        boolean expResult = false;
        boolean result = c.isInCounting();
        assertEquals(expResult, result);
        
    }

}
