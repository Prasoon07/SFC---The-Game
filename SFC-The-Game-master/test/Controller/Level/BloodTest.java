package Controller.Level;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author praso
 */
public class BloodTest {
    
    public BloodTest() {
    }
    Blood b;
    @Before
    public void setUp() {
        b = new Blood();
    }

    /**
     * Test of update method, of class Blood.
     */
    @Test
    public void TestGameStatus(){
        int gameTime = b.Game_Status();
        assertEquals(20, gameTime);
    }
    
    
}
