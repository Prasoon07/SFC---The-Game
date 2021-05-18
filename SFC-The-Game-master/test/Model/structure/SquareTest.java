package Model.structure;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author praso
 */
public class SquareTest {
    
    public SquareTest() {
    }
    
    @Before
    public void setUp() {
        Square s  = new Square(0 , 0 , 10, 10);
             
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isInside method, of class Square.
     */
    @Test
    public void testIsInsides() {
        System.out.println("isInside");
        int x = 0;
        int y = 0;
        int w = 0;
        int h = 0;
        Square instance = new Square();
        boolean expResult = false;
        boolean result = instance.isInsides(x, y , w, h);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
