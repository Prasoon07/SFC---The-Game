package Controller.Level;

import Model.operator.GameManager;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author praso
 */
public class LungTest {
    
    public LungTest() {
    }
    Lung b;
    @Before
    public void setUp() {
        GameManager GameManager = new GameManager();
        
        b = new Lung(GameManager);
    }

    /**
     * Test of update method, of class Lung.
     */
    @Test
    public void TestGameStatus(){
        int gameTime = b.Game_Status();
        assertEquals(30, gameTime);
    }
    
}
